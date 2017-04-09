import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String path = "text.txt";
    System.out.println(countLines(path));
  }

  public static int countLines(String filename) {
    int count = 0;
    try {
      Path path = Paths.get(filename);
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        count++;
      }
    } catch (Exception ex) {
      return 0;
    }
    return count;
  }
}