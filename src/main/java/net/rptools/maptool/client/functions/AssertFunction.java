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
package net.rptools.maptool.client.functions;

import java.math.BigDecimal;
import java.util.List;
import net.rptools.maptool.client.functions.exceptions.*;
import net.rptools.maptool.language.I18N;
import net.rptools.parser.Parser;
import net.rptools.parser.ParserException;
import net.rptools.parser.VariableResolver;
import net.rptools.parser.function.AbstractFunction;
import net.rptools.parser.function.ParameterException;

/**
 * Throws an exception with a user-defined error message if a condition is false. <br>
 * Usage: <code>assert(<i>condition</i>, <i>errorMessage</i>)</code>
 *
 * @author knizia.fan
 */
public class AssertFunction extends AbstractFunction implements DefinesSpecialVariables {
  public AssertFunction() {
    // Defining ourselves to be "non-deterministic" is a small hack that allows
    // comparison operations to be passed in as arguments, due to an error (?)
    // in InlineTreeFormatter.java.
    super(2, 3, false, "assert");
  }

  /** The singleton instance. */
  private static final AssertFunction instance = new AssertFunction();

  /**
   * Gets the instance.
   *
   * @return the singleton instance.
   */
  public static AssertFunction getInstance() {
    return instance;
  }

  @Override
  public Object childEvaluate(
      Parser parser, VariableResolver resolver, String functionName, List<Object> parameters)
      throws ParserException {
    if (!(parameters.get(1) instanceof String))
      throw new ParameterException(
          I18N.getText(
              "macro.function.assert.mustBeString", "assert", parameters.get(1).toString()));

    if (BigDecimal.ZERO.equals(parameters.get(0))) {
      if (parameters.size() > 2 && parameters.get(2).equals(BigDecimal.ZERO)) {
        throw new AssertFunctionException(parameters.get(1).toString());
      } else {
        throw new AssertFunctionException(
            I18N.getText("macro.function.assert.message", parameters.get(1).toString()));
      }
    }
    return BigDecimal.ONE;
  }

  @Override
  public String[] getSpecialVariables() {
    return new String[] {"macro.catchAssert"};
  }
}
