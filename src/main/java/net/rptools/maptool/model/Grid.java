/*
 * This software Copyright by the RPTools.net development team, and
 * licensed under the Affero GPL Version 3 or, at your option, any later
 * version.
 *
 * MapTool Source Code is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received a copy of the GNU Affero General Public
 * License * along with this source Code.  If not, please visit
 * <http://www.gnu.org/licenses/> and specifically the Affero license
 * text at <http://www.gnu.org/licenses/agpl.html>.
 */
package net.rptools.maptool.model;

import com.google.common.base.Stopwatch;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.swing.Action;
import javax.swing.KeyStroke;
import net.rptools.lib.FileUtil;
import net.rptools.maptool.client.AppPreferences;
import net.rptools.maptool.client.DeveloperOptions;
import net.rptools.maptool.client.MapTool;
import net.rptools.maptool.client.tool.PointerTool;
import net.rptools.maptool.client.ui.zone.GridRenderer;
import net.rptools.maptool.client.ui.zone.ZoneRenderer;
import net.rptools.maptool.client.walker.WalkerMetric;
import net.rptools.maptool.client.walker.ZoneWalker;
import net.rptools.maptool.events.MapToolEventBus;
import net.rptools.maptool.model.TokenFootprint.OffsetTranslator;
import net.rptools.maptool.model.zones.GridChanged;
import net.rptools.maptool.server.Mapper;
import net.rptools.maptool.server.proto.GridDto;
import net.rptools.maptool.util.GraphicsUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Base class for grids.
 *
 * @author trevor
 */
public abstract class Grid implements Cloneable {
  /**
   * The minimum grid size (minimum on any dimension). The default value is 9 because the algorithm
   * for determining whether a given square cell can be entered due to fog blocking the cell is
   * based on the cell being split into 3x3, then the center further being split into 3x3; thus at
   * least 9 pixels horizontally and vertically are required.
   */
  public static final int MIN_GRID_SIZE = 9;

  public static final int MAX_GRID_SIZE = 350;
  protected static final Logger log = LogManager.getLogger();
  protected static final int CIRCLE_SEGMENTS = 60;

  public static GridRenderStyle renderStyle = new GridRenderStyle();

  public static GridRenderStyle getRenderStyle() {
    return renderStyle;
  }

  public static void setRenderStyle(GridRenderStyle renderStyle) {
    Grid.renderStyle = renderStyle;
  }

  public static boolean vertical = true;
  private static final Dimension NO_DIM = new Dimension();
  private static final DirectionCalculator calculator = new DirectionCalculator();
  private static final Map<Integer, Area> gridShapeCache = new ConcurrentHashMap<>();
  protected Map<KeyStroke, Action> movementKeys = null;
  private int gridOffsetX = 0;
  private int gridOffsetY = 0;
  private int size;
  private Zone zone;

  public void setGridType(GridType gridType) {
    this.gridType = gridType;
  }

  public GridType gridType;
  private final GridRenderer gridRenderer = new GridRenderer();

  public GridCell gridCell;

  public GridCell getGridCell() {
    return gridCell;
  }

  public Shape getScaledCellPath(double scale) {
    return gridCell.getScaledCellShape(scale);
  }

  Shape scaledCellPath = null;
  Shape scaledCellHalfPath = null;

  public Grid() {
    setGridType(GridType.valueOf(AppPreferences.getDefaultGridType()));
    setSize(AppPreferences.getDefaultGridSize());
    gridCell = new GridCell(renderStyle.lineOffset);
  }

  public Grid(Grid grid) {
    setSize(grid.getSize());
    setGridOffset(grid.gridOffsetX, grid.gridOffsetY);
    gridCell = new GridCell(renderStyle.lineOffset);
  }

  protected synchronized Map<Integer, Area> getGridShapeCache() {
    return gridShapeCache;
  }

  protected synchronized void setGridShapeCache(int gridRadius, Area newGridArea) {
    final AffineTransform at = new AffineTransform();
    final double gridScale = (double) MAX_GRID_SIZE / getSize();
    at.scale(gridScale, gridScale);

    getGridShapeCache().put(gridRadius, newGridArea.createTransformedArea(at));

    // Verify combined Area is a single union of polygons
    if (!newGridArea.isSingular()) {
      log.warn(
          "gridShape {} is not singular, this is unexpected and could affect performance.",
          gridRadius);
    }
  }

  public void drawCoordinatesOverlay(Graphics2D g, ZoneRenderer renderer) {
    // Do nothing -- my default
  }

  /**
   * Set the facing options for tokens/objects on a grid. Each grid type can providing facings to
   * the edges, the vertices, both, or neither.
   *
   * <p>If both are false, tokens on that grid will not be able to rotate with the mouse and
   * keyboard controls for setting facing.
   *
   * @param faceEdges - Tokens can face edges.
   * @param faceVertices - Tokens can face vertices.
   */
  public void setFacings(boolean faceEdges, boolean faceVertices) {
    // Handle it in the individual grid types
  }

  public int[] getFacingAngles() {
    return null;
  }

  /**
   * Return the Point (double precision) for pixel center of Cell
   *
   * @param cell The cell to get the center of.
   * @return Point of the coordinates.
   */
  public abstract Point2D.Double getCellCenter(CellPoint cell);

  protected List<TokenFootprint> loadFootprints(String path, OffsetTranslator... translators)
      throws IOException {
    Object obj = FileUtil.objFromResource(path);
    @SuppressWarnings("unchecked")
    List<TokenFootprint> footprintList = (List<TokenFootprint>) obj;
    for (TokenFootprint footprint : footprintList) {
      for (OffsetTranslator ot : translators) {
        footprint.addOffsetTranslator(ot);
      }
    }
    return footprintList;
  }

  public TokenFootprint getDefaultFootprint() {
    for (TokenFootprint footprint : getFootprints()) {
      if (footprint.isDefault()) {
        return footprint;
      }
    }
    // None specified, use the first
    return getFootprints().get(0);
  }

  public TokenFootprint getFootprint(GUID guid) {
    if (guid == null) {
      return getDefaultFootprint();
    }
    for (TokenFootprint footprint : getFootprints()) {
      if (footprint.getId().equals(guid)) {
        return footprint;
      }
    }
    return getDefaultFootprint();
  }

  public abstract List<TokenFootprint> getFootprints();

  public boolean isIsometric() {
    return false;
  }

  public boolean useMetric() {
    return false; // only square & iso use metrics
  }

  public boolean isHex() {
    return false;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  /**
   * Returns Coordinates in Cell-space of a {@link ZonePoint}.
   *
   * @param zp The {@link ZonePoint} to convert.
   * @return Coordinates in Cell-space of the {@link ZonePoint}.
   */
  public abstract CellPoint convert(ZonePoint zp);

  /**
   * Returns a {@link ZonePoint} whose position within the cell depends on the grid type:
   *
   * <ul>
   *   <li><i>SquareGrid</i> - top right of cell (x_min, y_min)
   *   <li><i>HexGrid</i> - center of cell<br>
   * </ul>
   *
   * <p>For HexGrids Use getCellOffset() to move ZonePoint from center to top right.
   *
   * @param cp the {@link CellPoint} to convert.
   * @return a {@link ZonePoint} within the cell.
   */
  public abstract ZonePoint convert(CellPoint cp);

  public ZonePoint getNearestVertex(ZonePoint point) {
    int gridX = (int) Math.round((point.x - getGridOffsetX()) / getCellWidth());
    int gridY = (int) Math.round((point.y - getGridOffsetY()) / getCellHeight());

    return new ZonePoint(
        (int) (gridX * getCellWidth() + getGridOffsetX()),
        (int) (gridY * getCellHeight() + getGridOffsetY()));
  }

  public abstract GridCapabilities getCapabilities();

  public int getTokenSpace() {
    return getSize();
  }

  public double getCellWidth() {
    return 0;
  }

  public double getCellHeight() {
    return 0;
  }

  /**
   * @return the difference in pixels between the center of a cell and its converted zonepoint.
   */
  public abstract Point2D.Double getCenterOffset();

  /**
   * @return The offset required to translate from the center of a cell to the top right (x_min,
   *     y_min) of the cell's bounding rectangle. Used for non-square grids only.<br>
   *     <br>
   *     Why? Because mySquareGrid.convert(CellPoint cp) returns a ZonePoint in the top right
   *     corner(x_min, y_min) of the square-cell, whereas myHexGrid.convert(CellPoint cp) returns a
   *     ZonePoint in the center of the hex-cell. Thus adding the CellOffset allows us to position
   *     the ZonePoint returned by myHexGrid.convert(CellPoint cp) in an equivalent position to that
   *     returned by mySquareGrid.convert(CellPoint cp)....I think ;)
   */
  public Dimension getCellGridOffset() {
    return NO_DIM;
  }

  public Zone getZone() {
    return zone;
  }

  public void setZone(Zone zone) {
    this.zone = zone;
  }

  public Area getCellShape() {
    return gridCell.cellShapeArea;
  }

  public BufferedImage getCellHighlight() {
    return null;
  }

  protected Area createCellShape(double size) {
    return (Area) gridCell.getScaledCellShape(size);
  }
  /**
   * @param offsetX The grid's x offset component
   * @param offsetY The grid's y offset component
   */
  public void setGridOffset(int offsetX, int offsetY) {
    gridOffsetX = offsetX;
    gridOffsetY = offsetY;
    fireGridChanged();
  }

  public void setGridLineType(GridDrawLineStyle lineStyle) {
    renderStyle.lineStyle = lineStyle;
  }
  /**
   * @return The x component of the grid's offset.
   */
  public int getGridOffsetX() {
    return gridOffsetX;
  }

  /**
   * @return The y component of the grid's offset
   */
  public int getGridOffsetY() {
    return gridOffsetY;
  }

  public GridType getGridType() {
    return gridType;
  }

  public ZoneWalker createZoneWalker() {
    return null;
  }

  /**
   * Constrains size to {@code MIN_GRID_SIZE <= size <= MAX_GRID_SIZE}
   *
   * @param size the size value to constrain.
   * @return The size after it has been constrained.
   */
  protected final int constrainSize(int size) {
    if (size < MIN_GRID_SIZE) {
      size = MIN_GRID_SIZE;
    } else if (size > MAX_GRID_SIZE) {
      size = MAX_GRID_SIZE;
    }
    return size;
  }

  /**
   * @return The size of the grid<br>
   *     <br>
   *     *<i>SquareGrid</i> - edge length<br>
   *     *<i>HexGrid</i> - edge to edge diameter
   */
  public int getSize() {
    return size;
  }

  /**
   * Sets the grid size and creates the grid cell shape
   *
   * @param size The size of the grid<br>
   *     <i>SquareGrid</i> - edge length<br>
   *     <i>HexGrid</i> - edge to edge diameter
   */
  public void setSize(int size) {
    this.size = constrainSize(size);
    if (renderStyle == null) {
      gridCell = new GridCell();
    } else {
      gridCell = new GridCell(renderStyle.lineOffset);
    }
    fireGridChanged();
  }

  /**
   * Called by SightType and Light class to return a vision area based upon a specified distance
   *
   * @param shape CIRCLE, GRID, SQUARE or CONE
   * @param token Used to position the shape and to provide footprint
   * @param range As specified in the vision or light definition
   * @param arcAngle Only used by cone
   * @param offsetAngle Arc distance from facing, only used by cone
   * @param scaleWithToken used to increase the area based on token footprint
   * @return Area
   */
  public Area getShapedArea(
      ShapeType shape,
      Token token,
      double range,
      double arcAngle,
      int offsetAngle,
      boolean scaleWithToken) {
    if (shape == null) {
      shape = ShapeType.CIRCLE;
    }
    int visionDistance = zone.getTokenVisionInPixels();
    double visionRange = (range == 0) ? visionDistance : range * getSize() / zone.getUnitsPerCell();

    if (scaleWithToken) {
      double footprintWidth = token.getFootprint(this).getBounds(this).getWidth() / 2;
      // Test for gridless maps
      if (gridType == GridType.NONE) {
        // For grids, this will be the same, but for Hex's we'll use the smaller side depending on
        // which Hex type you choose
        double footprintHeight = token.getFootprint(this).getBounds(this).getHeight() / 2;
        visionRange += Math.min(footprintWidth, footprintHeight);
      } else {
        double tokenBoundsWidth = token.getBounds(getZone()).getWidth() / 2;
        visionRange += Math.max(footprintWidth, tokenBoundsWidth);
      }
    }

    Area visibleArea = new Area();
    switch (shape) {
      case CIRCLE:
        visibleArea =
            GraphicsUtil.createLineSegmentEllipse(
                -visionRange, -visionRange, visionRange, visionRange, CIRCLE_SEGMENTS);
        break;
      case GRID:
        visibleArea = getGridArea(token, range, scaleWithToken, visionRange);
        break;
      case SQUARE:
        visibleArea =
            new Area(
                new Rectangle2D.Double(
                    -visionRange, -visionRange, visionRange * 2, visionRange * 2));
        break;
      case CONE:
        if (token.getFacing() == null) {
          token.setFacing(0);
        }

        Arc2D cone =
            new Arc2D.Double(
                -visionRange,
                -visionRange,
                visionRange * 2,
                visionRange * 2,
                360.0 - (arcAngle / 2.0) + (offsetAngle * 1.0),
                arcAngle,
                Arc2D.PIE);

        // Flatten the cone to remove 'curves'
        GeneralPath path = new GeneralPath();
        path.append(cone.getPathIterator(null, 1), false);
        Area tempvisibleArea = new Area(path);

        // Rotate
        tempvisibleArea =
            tempvisibleArea.createTransformedArea(
                AffineTransform.getRotateInstance(-Math.toRadians(token.getFacing())));

        Rectangle footprint = token.getFootprint(this).getBounds(this);
        footprint.x = -footprint.width / 2;
        footprint.y = -footprint.height / 2;

        visibleArea.add(new Area(footprint));
        visibleArea.add(tempvisibleArea);
        break;
      case HEX:
        footprint = token.getFootprint(this).getBounds(this);
        double x = footprint.getCenterX();
        double y = footprint.getCenterY();

        double footprintWidth = token.getFootprint(this).getBounds(this).getWidth();
        double footprintHeight = token.getFootprint(this).getBounds(this).getHeight();
        double adjustment = Math.min(footprintWidth, footprintHeight);
        x -= adjustment / 2;
        y -= adjustment / 2;

        visibleArea = gridCell.getScaledVisionShapeArea(x, y, visionRange);
        break;
      default:
        visibleArea =
            GraphicsUtil.createLineSegmentEllipse(
                -visionRange, -visionRange, visionRange * 2, visionRange * 2, CIRCLE_SEGMENTS);
        break;
    }

    return visibleArea;
  }

  /**
   * Return the cell distance between two cells. Does not take into account terrain or VBL.
   * Overridden by Hex &amp; Gridless grids.
   *
   * @param cellA the first cell
   * @param cellB the second cell
   * @param wmetric the walker metric
   * @return the distance (in cells) between the two cells
   */
  public double cellDistance(CellPoint cellA, CellPoint cellB, WalkerMetric wmetric) {
    int distance;
    int distX = Math.abs(cellA.x - cellB.x);
    int distY = Math.abs(cellA.y - cellB.y);
    if (wmetric == WalkerMetric.NO_DIAGONALS || wmetric == WalkerMetric.MANHATTAN) {
      distance = distX + distY;
    } else if (wmetric == WalkerMetric.ONE_ONE_ONE) {
      distance = Math.max(distX, distY);
    } else if (wmetric == WalkerMetric.ONE_TWO_ONE) {
      distance = Math.max(distX, distY) + Math.min(distX, distY) / 2;
    } else {
      System.out.println("Incorrect WalkerMetric in method cellDistance of Grid.java");
      distance = -1; // error, should not happen;
    }
    return distance;
  }

  private void fireGridChanged() {
    gridShapeCache.clear();
    new MapToolEventBus().getMainEventBus().post(new GridChanged(this.zone));
  }

  /**
   * Draws the grid scaled to the renderer's scale and within the renderer's boundaries.
   *
   * @param renderer the {@link ZoneRenderer} that represents the screen view.
   * @param g the {@link Graphics2D} class used for drawing.
   * @param bounds the bounds of the drawing area.
   */
  public void draw(ZoneRenderer renderer, Graphics2D g, Rectangle bounds) {
    GridRenderer.draw(renderer, g, bounds, this, renderStyle);
  }

  /**
   * Returns a rectangle of pixels bounding the CellPoint, taking into account the grid offset.
   *
   * @param cp the CellPoint to bound.
   * @return the bounding rectangle.
   */
  public abstract Rectangle getBounds(CellPoint cp);

  /**
   * Override if getCapabilities.isSecondDimensionAdjustmentSupported() returns true
   *
   * @return length the curent value of the second settable dimension
   */
  public double getSecondDimension() {
    return 0;
  }

  /**
   * Override if getCapabilities.isSecondDimensionAdjustmentSupported() returns true
   *
   * @param length the second settable dimension
   */
  public void setSecondDimension(double length) {}

  /**
   * Installs a list of which actions go with which keystrokes for the purpose of moving the token.
   *
   * @param callback The object whose methods are invoked when the event occurs
   * @param actionMap the map of existing keystrokes we want to add ourselves to
   */
  public abstract void installMovementKeys(PointerTool callback, Map<KeyStroke, Action> actionMap);

  public abstract void uninstallMovementKeys(Map<KeyStroke, Action> actionMap);

  /**
   * Tests the grid cell location to determine whether a token is allowed to move into it when such
   * movement is player-initiated. (The GM may always move a token into a given grid cell.) This
   * implementation only handles square grids. When a hex and/or gridless implementation is created,
   * this method should be refactored to the {@link SquareGrid} class and this method changed to
   * always return <code>true</code>.
   *
   * <p>Theory of operation:
   *
   * <ol>
   *   <li>Break the area to check into a 3x3 set of pieces.
   *   <li>Determine which direction the token is coming from.
   *   <li>For the three pieces of the 3x3 set which are closest to that incoming direction, if all
   *       of the three contain fog, the cell cannot be entered. Return <code>false</code>.
   *       Otherwise, at least one does not contain fog. Proceed to the next step.
   *   <li>Select the region encompassed by the center of the 3x3 set of pieces.
   *   <li>Break this region into another 3x3 set of pieces.
   *   <li>If at least 6 of these pieces are fog-free, then the space is open. Return <code>true
   *       </code>.
   *   <li>If at least 4 of these pieces contain fog, then the space is closed. Return <code>false
   *       </code>.
   * </ol>
   *
   * @param token token whose movement is being validated; passed in case token state is needed
   * @param areaToCheck destination area to check, measured in ZonePoint units
   * @param dirx direction token is traveling along the X axis
   * @param diry direction token is traveling along the Y axis
   * @param exposedFog area in which fog has been cleared away
   * @return true or false whether the token may move into the area
   */
  public boolean validateMove(
      Token token, Rectangle areaToCheck, int dirx, int diry, Area exposedFog) {
    int direction = calculator.getDirection(dirx, diry);

    Rectangle bounds = new Rectangle();
    int bit = 1;

    if (areaToCheck.width < 9 || (dirx == 0 && diry == 0)) {
      direction = (512 - 1) & ~DirectionCalculator.CENTER;
    }

    for (int dy = 0; dy < 3; dy++) {
      for (int dx = 0; dx < 3; dx++, bit *= 2) {
        if ((direction & bit) == 0) {
          continue;
        }
        oneThird(areaToCheck, dx, dy, bounds);

        // The 'fog' variable defines areas where fog has been cleared away
        if (!exposedFog.contains(bounds)) {
          continue;
        }
        return checkCenterRegion(areaToCheck, exposedFog);
      }
    }
    // Everything is covered with fog. Or at least, the three regions that we wanted to use to enter
    // the destination area.
    return false;
  }

  /**
   * Returns an area based upon the token's cell footprint.
   *
   * @param bounds the bounds of the cell.
   * @return the {@link Area} based on the footprint.
   */
  public Area getTokenCellArea(Rectangle bounds) {
    // Get the cell footprint
    return new Area(bounds);
  }

  public Area getTokenCellArea(Area bounds) {
    // Get the cell footprint
    return new Area(bounds);
  }

  /**
   * Check the middle region by subdividing into 3x3 and checking to see if at least 6 are open.
   *
   * @param regionToCheck rectangular region to check for hard fog
   * @param fog defines areas where fog is currently covering the background
   * @return {@code true} if at least 6 regions are open.
   */
  public boolean checkCenterRegion(Rectangle regionToCheck, Area fog) {
    Rectangle center = new Rectangle();
    Rectangle bounds = new Rectangle();
    oneThird(regionToCheck, 1, 1, center); // selects the CENTER piece

    int closedSpace = 0;
    int openSpace = 0;
    for (int dy = 0; dy < 3; dy++) {
      for (int dx = 0; dx < 3; dx++) {
        oneThird(center, dx, dy, bounds);
        if (bounds.width < 1 || bounds.height < 1) {
          continue;
        }
        if (!fog.intersects(bounds)) {
          if (++closedSpace > 3) {
            return false;
          }
        } else {
          if (++openSpace > 5) {
            return true;
          }
        }
      }
    }
    log.info(
        "Center region of size {} contains neither 4+ closed spaces nor 6+ open spaces?!",
        regionToCheck.getSize());
    return openSpace >= closedSpace;
  }

  /**
   * Check the region by subdividing into 3x3 and checking to see if at least {@code tolerance} are
   * open.
   *
   * @param regionToCheck rectangular region to check for hard fog
   * @param fog defines areas where fog is currently covering the background
   * @param tolerance the number of open regions to check for.
   * @return {code true} if there are at least {@code tolerance} open regions.
   */
  public boolean checkRegion(Rectangle regionToCheck, Area fog, int tolerance) {
    Rectangle bounds = new Rectangle();

    int closedSpace = 0;
    int openSpace = 0;
    for (int dy = 0; dy < 3; dy++) {
      for (int dx = 0; dx < 3; dx++) {
        oneThird(regionToCheck, dx, dy, bounds);
        if (bounds.width < 1 || bounds.height < 1) {
          continue;
        }
        if (!fog.intersects(bounds)) {
          if (++closedSpace > (9 - tolerance)) {
            return false;
          }
        } else {
          if (++openSpace > tolerance) {
            return true;
          }
        }
      }
    }
    log.info(
        "Center region of size {} contains neither {}+ closed spaces nor {}+ open spaces?!",
        regionToCheck.getSize(),
        9 - tolerance,
        tolerance);
    return openSpace >= closedSpace;
  }

  /**
   * Divides the specified region into one of nine parts, where the column and row range from 0..2.
   * The destination Rectangle must already exist (no check for this is made) and it must not be a
   * reference to the same object as the region to divide (also not checked).
   *
   * @param regionToDivide region to subdivide
   * @param column column in the 3x3 grid
   * @param row row in the 3x3 grid
   * @param destination one of nine possible pieces represented as a Rectangle
   */
  private void oneThird(Rectangle regionToDivide, int column, int row, Rectangle destination) {
    int width = regionToDivide.width * column / 3;
    int height = regionToDivide.height * row / 3;
    destination.x = regionToDivide.x + width;
    destination.y = regionToDivide.y + height;
    destination.width =
        regionToDivide.width * (column + 1) / 3 - regionToDivide.width * column / 3; // don't
    // simplify
    // or
    // roundoff
    // will be
    // introduced
    destination.height = regionToDivide.height * (row + 1) / 3 - regionToDivide.height * row / 3;
  }

  /**
   * Returns an Area with a given radius that is shaped and aligned to the current grid
   *
   * @param token token which to center the grid area on
   * @param range range in units grid area extends out to
   * @param scaleWithToken whether grid area should expand by the size of the token
   * @param visionRange token's vision in pixels
   * @return the {@link Area} conforming to the current grid layout
   */
  protected Area getGridArea(
      Token token, double range, boolean scaleWithToken, double visionRange) {

    final Area visibleArea;

    if (range > 0) {
      final Stopwatch stopwatch = Stopwatch.createStarted();
      final int gridRadius = (int) (range / getZone().getUnitsPerCell());

      if (scaleWithToken) {
        visibleArea = getScaledGridArea(token, gridRadius);
      } else {
        visibleArea = getGridAreaFromCache(gridRadius).createTransformedArea(getGridOffset(token));
      }

      if (stopwatch.elapsed(TimeUnit.MILLISECONDS) > 50) {
        log.debug(
            "Excessive time to generate {}r grid light, took {}ms",
            gridRadius,
            stopwatch.elapsed(TimeUnit.MILLISECONDS));
      }
    } else {
      // Fall back to regular circle in daylight, etc.
      visibleArea =
          GraphicsUtil.createLineSegmentEllipse(
              -visionRange, -visionRange, visionRange, visionRange, CIRCLE_SEGMENTS);
    }

    return visibleArea;
  }

  /**
   * Returns a combined Area where radius included the tokens footprint. e.g. a 15ft light on a Huge
   * token radiates 15ft from all sides of the token.
   *
   * @param token token to generate area from
   * @param gridRadius distance from token edge to generate area
   * @return the {@link Area} conforming to the current grid layout scaled to include the tokens
   *     size
   */
  protected Area getScaledGridArea(Token token, int gridRadius) {
    final double offsetX = token.getX() + token.getFootprint(this).getBounds(this).getWidth() / 2;
    final double offsetY = token.getY() + token.getFootprint(this).getBounds(this).getHeight() / 2;
    final Area gridArea = getGridAreaFromCache(gridRadius);
    Area occupiedArea = new Area();

    for (CellPoint occupiedCell : token.getOccupiedCells(this)) {
      final double x = (occupiedCell.x * getSize()) - offsetX;
      final double y = (occupiedCell.y * getSize()) - offsetY;
      final AffineTransform at = new AffineTransform();
      at.translate(x, y);

      occupiedArea.add(gridArea.createTransformedArea(at));
    }

    return occupiedArea;
  }

  /**
   * Returns translated coordinates to adjust the grid area for token footprints that are an odd
   * number of cells and SCALE keyword is not used to adjust the Area proportionally.
   *
   * @param token source token to check footprint against
   * @return the {@link AffineTransform} to align an {@link Area} to the current grid
   */
  protected AffineTransform getGridOffset(Token token) {
    double footprintWidth = token.getFootprint(this).getBounds(this).getWidth();

    final AffineTransform at = new AffineTransform();
    if ((footprintWidth / getSize()) % 2 != 0) {
      double coordinateOffset = getSize() / -2f;
      at.translate(coordinateOffset, coordinateOffset);
    }
    return at;
  }

  /**
   * Generates an Area that conforms to the current grid cells to the specified radius and caches
   * the results
   *
   * @param gridRadius radius of the Area measured using ONE_TWO_ONE metric
   */
  protected void createGridArea(int gridRadius) {
    final Area cellArea = new Area(gridCell.cellPath);
    final Set<Point> points = generateRadius(gridRadius);
    Area gridArea = new Area();

    for (Point point : points) {
      final AffineTransform at = new AffineTransform();
      at.translate((point.x) * getSize(), (point.y) * getSize());
      gridArea.add(cellArea.createTransformedArea(at));
    }

    setGridShapeCache(gridRadius, gridArea);
  }

  /**
   * Generates a set of {@link Point} used to create a grid area that only includes the outer most
   * edge of cells
   *
   * @param radius The maximum radius to generate the ring of cell points for this range
   * @return a {@link HashSet} that includes all cells that only equal in distance to the given
   *     radius
   */
  protected Set<Point> generateRing(int radius) {
    return generateRadius(radius, radius);
  }

  /**
   * Generates a set of {@link Point} used to create a grid area
   *
   * @param radius The maximum radius to generate all cell points within this range
   * @return a {@link HashSet} that includes all cells up to the radius
   */
  protected Set<Point> generateRadius(int radius) {
    return generateRadius(0, radius);
  }

  /**
   * Generates a set of {@link Point} used to create a grid area
   *
   * @param minRadius The minimum radius to generate the ring of cell points for this range
   * @param maxRadius The maximum radius to generate the ring of cell points for this range
   * @return a {@link HashSet} that includes all cells between the minRadius to the maxRadius
   */
  protected Set<Point> generateRadius(int minRadius, int maxRadius) {
    Set<Point> points = new HashSet<>();
    CellPoint start = new CellPoint(0, 0);

    WalkerMetric metric = getCurrentMetric();

    for (int y = -maxRadius; y <= maxRadius; y++) {
      for (int x = -maxRadius; x <= maxRadius; x++) {
        double distance = cellDistance(start, new CellPoint(x, y), metric);
        if (distance >= minRadius && distance <= maxRadius) {
          points.add(new Point(x, y));
        }
      }
    }

    return points;
  }

  /**
   * Future change may include getting a metric from a different property/source
   *
   * @return the current {@link WalkerMetric} depending on if a server is running or not
   */
  protected WalkerMetric getCurrentMetric() {
    return MapTool.isPersonalServer()
        ? AppPreferences.getMovementMetric()
        : MapTool.getServerPolicy().getMovementMetric();
  }

  /**
   * Retrieve the generated grid conformed {@link Area} from cache if it exists, otherwise generate,
   * store, and return it.
   *
   * @param gridRadius The radius of the {@link Area} to retrieve from cache.
   * @return the {@link Area} from cache for the given gridRadius
   */
  protected Area getGridAreaFromCache(int gridRadius) {
    // If not already in cache, create and cache it
    // Or if the flag is enabled, recreate cache
    if (DeveloperOptions.Toggle.IgnoreGridShapeCache.isEnabled()
        || !getGridShapeCache().containsKey(gridRadius)) {
      createGridArea(gridRadius);
    }

    double rescale = getSize() / (double) MAX_GRID_SIZE;
    final AffineTransform at = new AffineTransform();
    at.scale(rescale, rescale);

    return getGridShapeCache().get(gridRadius).createTransformedArea(at);
  }

  public static Grid fromDto(GridDto dto) {
    Grid grid = null;
    switch (dto.getTypeCase()) {
      case GRIDLESS_GRID -> grid = new GridlessGrid();
      case HEX_GRID -> grid = HexGrid.fromDto(dto.getHexGrid());
      case SQUARE_GRID -> grid = new SquareGrid();
      case ISOMETRIC_GRID -> grid = new IsometricGrid();
    }
    assert grid != null;
    grid.gridOffsetX = dto.getOffsetX();
    grid.gridOffsetY = dto.getOffsetY();
    grid.size = dto.getSize();
    if (dto.hasCellShape()) {
      grid.gridCell.cellShapeArea = Mapper.map(dto.getCellShape());
    } else {
      grid.gridCell.cellShapeArea = null;
    }
    return grid;
  }

  protected abstract void fillDto(GridDto.Builder dto);

  public GridDto toDto() {
    var dto = GridDto.newBuilder();
    fillDto(dto);
    dto.setOffsetX(gridOffsetX);
    dto.setOffsetY(gridOffsetY);
    dto.setSize(size);
    if (gridCell.cellShapeArea != null) {
      dto.setCellShape(Mapper.map(gridCell.cellShapeArea));
    }
    return dto.build();
  }

  static class DirectionCalculator {

    private static final int NW = 1;
    private static final int N = 2;
    private static final int NE = 4;
    private static final int W = 8;
    private static final int CENTER = 16;
    private static final int E = 32;
    private static final int SW = 64;
    private static final int S = 128;
    private static final int SE = 256;

    public int getDirection(int dirx, int diry) {
      int TopRow = (NW | N | NE);
      int MidRow = (W | CENTER | E);
      int BotRow = (SW | S | SE);

      int LeftCol = (NW | W | SW);
      int MidCol = (N | CENTER | S);
      int RightCol = (NE | E | SE);

      int direction = TopRow | MidRow | BotRow;

      if (dirx > 0) {
        direction &= (LeftCol | MidCol); // two left columns
      }
      if (dirx < 0) {
        direction &= (MidCol | RightCol); // two right columns
      }

      if (diry > 0) {
        direction &= (TopRow | MidRow); // two top rows
      }
      if (diry < 0) {
        direction &= (MidRow | BotRow); // two bottom rows
      }

      if (dirx == 0) {
        direction &= ~MidRow;
      }
      if (diry == 0) {
        direction &= ~MidCol;
      }

      direction &= ~CENTER; // Always turn off the center since we don't check it using the outside
      // iterations...

      return direction;
    }
  }

  public class GridCell {
    static double lastScale = 1;
    static double lastVisionScale = 1f;
    static double lastX = 0f;
    static double lastY = 0f;
    double ROOT2 = Math.sqrt(2f);
    double ROOT3 = Math.sqrt(3f);
    double cellOffsetX = 0, cellOffsetY = 0;
    double lineOffset = 0;
    public Path2D.Double cellPath = new Path2D.Double();
    public Path2D.Double cellHalfPath = new Path2D.Double();
    public Shape scaledCellShape, scaledCellHalfShape;
    public Area cellShapeArea, scaledCellShapeArea, scaledVisionShapeArea;
    double[][][] vArray = {
      {{-0.5, -0.5}, {-0.5, 0.5}, {0.5, 0.5}, {0.5, -0.5}}, // square
      {{0, -0.5}, {0.5, -0.25}, {0.5, 0.25}, {0, 0.5}, {-0.5, 0.25}, {-0.5, -0.25}} // vHex
    }; // points used for constructing paths, centred on 0,0 with size 1,1
    public double size, colSpacing, rowSpacing;
    public Rectangle2D dimensions;
    AffineTransform at = new AffineTransform();

    void createShapes() {
      double[][] ptArray = vArray[gridType.name().contains("HEX") ? 1 : 0];
      int vLen = ptArray.length;
      int vHalf = vLen / 2 + 1; // when to stop adding points to halfPath

      cellPath.moveTo(ptArray[0][0], ptArray[0][1]); // move to paths start point
      cellHalfPath.moveTo(ptArray[0][0], ptArray[0][1]);
      for (int i = 1; i < vLen; i++) {
        if (i < vHalf) {
          cellHalfPath.lineTo(ptArray[i][0], ptArray[i][1]);
        }
        cellPath.lineTo(ptArray[i][0], ptArray[i][1]);
      }
      // just in case it didn't close the path
      cellPath.closePath();
      cellHalfPath.closePath();

      if (cellOffsetX != 0)
        at.translate(cellOffsetX, cellOffsetY); // because squares have to be different
      if (gridType.name().contains("HEX"))
        at.scale(1, ROOT3); // easier than doing lots of ROOT3 points calculations for hexes
      if (gridType.horizontal()) at.rotate(Math.PI / 2f); // spin horizontal hex 90 degrees
      if (gridType.isometric()) {
        if (gridType == GridType.SQUARE) { // iso squares
          at.rotate(Math.PI / 4f); // spin square 45 degrees
          at.scale(1 / ROOT2, 0.5f / ROOT2); // squish it down to 1 wide and 0.5 height
        } else if (gridType.name().contains("HEX")) { // iso hexes
          at.rotate(Math.PI / 6f); // spin hex 30 degrees
          at.scale(
              Math.acos(Math.PI / 6f),
              Math.asin(Math.PI / 6f) / 2); // squish it down to 1 wide and 0.5 height
        }
      }

      at.scale(size, size); // make it look big

      // for initial scale of 1
      lastScale = 1;
      // apply transforms to paths and create areas/shapes/etc.

      cellShapeArea = scaledCellShapeArea = new Area(cellPath.createTransformedShape(at));
      cellPath.transform(at);
      cellHalfPath.transform(at);

      // initial scaled path values
      scaledCellPath = cellPath;
      scaledCellHalfPath = cellHalfPath;

      dimensions = cellPath.getBounds2D();

      if (lineOffset != 0) { // if lines are not to be drawn on edges, shrink the whole thing again
        at = new AffineTransform();
        double lineOffsetScalingFactor =
            (size - (gridType.isometric() ? lineOffset * 2 : lineOffset)) / size;
        at.scale(lineOffsetScalingFactor, lineOffsetScalingFactor);
        // apply transforms to paths
        scaledCellShapeArea = (Area) cellPath.createTransformedShape(at);
        scaledCellHalfPath = cellHalfPath.createTransformedShape(at);
        scaledCellPath = cellPath.createTransformedShape(at);
      }
    }

    public Shape getScaledCellShape(double scale) {
      if (scale != lastScale) createScaledShapes(scale);
      return scaledCellShape;
    }

    public Shape getScaledCellHalfShape(double scale) {
      if (scale != lastScale) createScaledShapes(scale);
      return scaledCellHalfShape;
    }

    public void createScaledShapes(double scale) {
      if (scale == lastScale
          && scaledCellShape != null
          && scaledCellHalfShape != null
          && scaledCellShapeArea != null) return;
      at = new AffineTransform();
      at.scale(scale, scale);
      scaledCellShapeArea = (Area) cellPath.createTransformedShape(at);
      scaledCellShape = cellPath.createTransformedShape(at);
      scaledCellHalfShape = cellHalfPath.createTransformedShape(at);
      lastScale = scale;
    }

    public GridCell() {
      new GridCell(0f);
    }

    public GridCell(double lineOffset_) {
      size = getSize();
      lineOffset = lineOffset_ / 2f;
      if (gridType == GridType.SQUARE) cellOffsetX = cellOffsetY = size / 2f;
      createShapes();
      double h = dimensions.getHeight();
      double w = dimensions.getWidth();
      switch (gridType) {
        case HEX_H -> {
          rowSpacing = 0.75 * h;
          colSpacing = w / 2;
        }
        case HEX_V -> {
          rowSpacing = h / 2;
          colSpacing = 0.75 * w;
        }
        case ISOMETRIC_HEX, ISOMETRIC_SQUARE -> {
          rowSpacing = h;
          colSpacing = w / 2;
        }
        case SQUARE -> {
          rowSpacing = h;
          colSpacing = w;
        }
      }
    }

    public Area getScaledVisionShapeArea(double x, double y, double visionRange) {
      if (x == lastX
          && y == lastY
          && visionRange == lastVisionScale
          && scaledVisionShapeArea != null) return scaledVisionShapeArea;
      at = new AffineTransform();
      at.scale(visionRange, visionRange);
      at.translate(x, y);
      return cellShapeArea.createTransformedArea(at);
    }
  }
}
