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
package net.rptools.maptool.client.tool.gridtool;

import javax.swing.*;
import net.rptools.maptool.client.swing.ColorWell;

public class AdjustGridControlPanelView {
  private JPanel mainPanel;
  private ColorWell alternateColourPicker;
  private ColorWell mainColourPicker;
  private JCheckBox gridFade;
  private JComboBox gridStyle;
  private JCheckBox useTwoColours;
  private JSpinner lineOffset;
  private JComboBox blendComposite;
  private JTextField secondSize;
  private JTextField gridOffsetX;
  private JTextField gridOffsetY;
  private JSpinner gridSize;
  private JSlider zoomSlider;
  private JSpinner lineWeight;
  private JCheckBox exposedOnly;
  private JSlider opacity;
  private JLabel opacityLabel;
  private JComboBox gridType;

  public JComponent getRootComponent() {
    return mainPanel;
  }

  private void createUIComponents() {
    mainColourPicker = new ColorWell();
    alternateColourPicker = new ColorWell();
  }
}
