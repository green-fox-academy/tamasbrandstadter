import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("my-file.txt");
      List<String> lines = Files.readAllLines(path);
      System.out.println(lines);
    } catch (Exception ex) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}