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

import java.util.Objects;

/**
 * Given a string describing the type of desired grid, this factory creates and returns an object of
 * the appropriate type.
 *
 * <p>(Ugh. This really should use an SPI-like factory interface.)
 */
public class GridFactory {
  public static GridType gridType;

  public static Grid createGrid(GridType type) {
    return createGrid(type, true, false);
  }

  public static Grid createGrid(GridType type, boolean faceEdges, boolean faceVertices) {
    switch (type) {
      case HEX_V:
        return new HexGridVertical(faceEdges, faceVertices);
      case HEX_H:
        return new HexGridHorizontal(faceEdges, faceVertices);
      case ISOMETRIC_HEX:
        return new IsometricGrid(faceEdges, faceVertices);
      case ISOMETRIC_PLACEHOLDER:
        return new IsometricGrid(faceEdges, faceVertices);
      case ISOMETRIC_SQUARE:
        return new IsometricGrid(faceEdges, faceVertices);
      case NONE:
        return new GridlessGrid();
      case SQUARE:
        return new SquareGrid(faceEdges, faceVertices);
    }
    throw new IllegalArgumentException("Unknown grid type: " + type);
  }

  public static String getGridType(Grid grid) {
    return grid.getGridType().name();
  }

  public static boolean isSquare() {
    return gridType == GridType.SQUARE;
  }

  public static boolean isSquare(String name) {
    return Objects.equals(gridType.friendly(), name);
  }

  public static boolean isNone() {
    return gridType == GridType.NONE;
  }

  public static boolean isNone(String name) {
    return Objects.equals(gridType.friendly(), name);
  }

  public static boolean isHexVertical(String name) {
    return Objects.equals(gridType.friendly(), name);
  }

  public static boolean isHexVertical() {
    return gridType == GridType.HEX_V;
  }

  public static boolean isHexHorizontal(String name) {
    return Objects.equals(gridType.friendly(), name);
  }

  public static boolean isHexHorizontal() {
    return gridType == GridType.HEX_H;
  }

  public static boolean isIsometricSquare(String name) {
    return Objects.equals(gridType.friendly(), name);
  }

  public static boolean isIsometricSquare() {
    return gridType == GridType.ISOMETRIC_SQUARE;
  }

  public static boolean isIsometricHex(String name) {
    return Objects.equals(gridType.friendly(), name);
  }

  public static boolean isIsometricHex() {
    return gridType == GridType.ISOMETRIC_HEX;
  }
}
