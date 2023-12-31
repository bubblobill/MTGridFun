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
package net.rptools.lib.net;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import net.rptools.maptool.server.proto.LocalLocationDto;
import net.rptools.maptool.server.proto.LocationDto;
import org.apache.commons.io.IOUtils;

public class LocalLocation implements Location {

  private String localFile;

  public LocalLocation() {
    // For serialization
  }

  public LocalLocation(File file) {
    this.localFile = file.getAbsolutePath();
  }

  public File getFile() {
    return new File(localFile);
  }

  public InputStream getContent() throws IOException {
    return new BufferedInputStream(new FileInputStream(getFile()));
  }

  public void putContent(InputStream content) throws IOException {
    try (OutputStream out = new BufferedOutputStream(new FileOutputStream(getFile()))) {
      IOUtils.copy(content, out);
    }
  }

  public void putContent(ImageWriter writer, BufferedImage content) throws IOException {
    try (FileImageOutputStream out = new FileImageOutputStream(getFile())) {
      writer.setOutput(out);
      writer.write(content);
    }
  }

  public static LocalLocation fromDto(LocalLocationDto dto) {
    var location = new LocalLocation();
    location.localFile = dto.getLocalFile();
    return location;
  }

  public LocationDto toDto() {
    var dto = LocalLocationDto.newBuilder().setLocalFile(localFile);
    return LocationDto.newBuilder().setLocalLocation(dto).build();
  }
}
