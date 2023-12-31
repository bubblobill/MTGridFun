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
package net.rptools.maptool.client.macro.impl;

import java.util.List;
import net.rptools.maptool.client.MapTool;
import net.rptools.maptool.client.MapToolMacroContext;
import net.rptools.maptool.client.macro.Macro;
import net.rptools.maptool.client.macro.MacroContext;
import net.rptools.maptool.client.macro.MacroDefinition;
import net.rptools.maptool.client.macro.MacroManager;
import net.rptools.maptool.client.macro.MacroManager.MacroDetails;
import net.rptools.maptool.client.macro.MacroManager.Scope;
import net.rptools.maptool.language.I18N;
import org.javatuples.Pair;

/**
 * Macro to clear the message panel
 *
 * @author jgorrell
 * @version $Revision: 5945 $ $Date: 2013-06-03 04:35:50 +0930 (Mon, 03 Jun 2013) $ $Author:
 *     azhrei_fje $
 */
@MacroDefinition(
    name = "alias",
    aliases = {"alias"},
    description = "alias.description",
    expandRolls = false)
public class AliasMacro implements Macro {
  public void execute(MacroContext context, String macro, MapToolMacroContext executionContext) {
    macro = macro.trim();

    // Request for list ?
    if (macro.length() == 0) {
      handlePrintAliases();
      return;
    }
    // Split into components
    String name = macro;
    String value = null;
    int split =
        macro.indexOf(
            ' '); // LATER: this character should be externalized and shared with the load alias
    // macro
    if (split > 0) {
      name = macro.substring(0, split);
      value = macro.substring(split).trim();
    }
    if (value != null) {
      MacroManager.setAlias(name, value, Scope.CLIENT, "");
      MapTool.addLocalMessage(I18N.getText("alias.added", name));
    } else {
      if (MacroManager.removeAlias(name, Scope.CLIENT)) {
        MapTool.addLocalMessage(I18N.getText("alias.removed", name));
      } else {
        MapTool.addLocalMessage(I18N.getText("alias.notFound", name));
      }
    }
  }

  private void handlePrintAliases(String title, List<MacroDetails> macros) {
    StringBuilder builder = new StringBuilder();
    builder.append("<b>").append(title).append("</b><br/>");
    builder.append("<table border='1'>");

    builder
        .append("<tr><td><b>")
        .append(I18N.getText("alias.header"))
        .append("</b></td><td><b>")
        .append(I18N.getText("alias.commandHeader"))
        .append("</b></td><td><b>")
        .append(I18N.getText("alias.descriptionHeader"))
        .append("</b></td></tr>");

    macros.forEach(
        d -> {
          String command = d.command().replace("<", "&lt;").replace(">", "&gt;");
          String desc = d.description().replace("<", "&lt;").replace(">", "&gt;");
          builder
              .append("<tr><td>")
              .append(d.name())
              .append("</td><td>")
              .append(command)
              .append("</td><td>")
              .append(desc)
              .append("</td></tr>");
        });
    builder.append("</table>");
    MapTool.addLocalMessage(builder.toString());
  }

  private void handlePrintAddOnAliases() {
    var addons =
        MacroManager.getAliasDetails().values().stream()
            .flatMap(List::stream)
            .filter(m -> m.scope() == Scope.ADDON)
            .map(m -> new Pair<>(m.addOnName(), m.addOnNamespace()))
            .distinct()
            .sorted((a, b) -> a.getValue0().compareToIgnoreCase(b.getValue0()))
            .toList();

    addons.forEach(
        p -> {
          var addOnName = p.getValue0();
          var addOnNamespace = p.getValue1();
          handlePrintAliases(
              I18N.getText("alias.addon.title", addOnName, addOnNamespace),
              MacroManager.getAliasDetails().values().stream()
                  .flatMap(List::stream)
                  .filter(m -> m.scope() == Scope.ADDON)
                  .filter(m -> m.addOnNamespace().equals(addOnNamespace))
                  .sorted((a, b) -> a.name().compareToIgnoreCase(b.name()))
                  .distinct()
                  .toList());
        });
  }

  private void handlePrintAliases() {
    handlePrintAliases(
        I18N.getText("alias.client.title"),
        MacroManager.getAliasDetails().values().stream()
            .flatMap(List::stream)
            .filter(m -> m.scope() == Scope.CLIENT)
            .toList());
    handlePrintAliases(
        I18N.getText("alias.campaign.title"),
        MacroManager.getAliasDetails().values().stream()
            .flatMap(List::stream)
            .filter(m -> m.scope() == Scope.CAMPAIGN)
            .toList());
    handlePrintAddOnAliases();
  }
}
