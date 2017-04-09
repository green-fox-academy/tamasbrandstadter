import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultiplyLine {
  public static void main(String[] args) {
    writeMultiplyLine("text.txt", "apple", 3);
  }

  public static void writeMultiplyLine(String path, String word, int number) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      list.add(word);
    }
    try {
      Path filepath = Paths.get(path);
      Files.write(filepath, list);
    } catch (Exception e) {
      System.out.println("Couldn't write the file.");
    }
  }
}