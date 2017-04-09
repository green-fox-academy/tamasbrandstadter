import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    decryptText("doubled.txt");
  }

  public static void decryptText(String file1) {
    List<String> list = new ArrayList<>();
    Path filepath = Paths.get(file1);
    try {
      list = Files.readAllLines(filepath);
      String myString = list.toString();
      for (int i = 0; i < myString.length(); i++) {
        if (myString.substring(i, i + 1).equals(myString.substring(i + 1, i + 2))) {
          System.out.println(myString.substring(i, i + 1));
        }
      }
    } catch (Exception ex) {
      System.out.println("Cannot open file.");
    }
  }
}