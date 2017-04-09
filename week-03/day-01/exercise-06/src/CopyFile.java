import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    copyFile("try.txt", "result.txt");
  }

  private static boolean copyFile(String file1, String file2) {
    List<String> list = new ArrayList<>();
    Path filepath = Paths.get(file1);
    Path filepath2 = Paths.get(file2);
    try {
      list = Files.readAllLines(filepath);
      Files.write(filepath2, list);
    } catch (Exception ex) {

      System.out.println("Uh-oh, could not write the file!");
    }
    return true;
  }
}