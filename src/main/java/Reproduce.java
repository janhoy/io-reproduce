import org.apache.commons.io.file.PathUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reproduce {
  public static void main(String[] args) throws IOException {
    reproduce();
  }

  public static void reproduce() throws IOException {
    Path tmpPath = Files.createTempDirectory("tmp");
    PathUtils.deleteDirectory(tmpPath.resolve("nonexistent"));
  }
}
