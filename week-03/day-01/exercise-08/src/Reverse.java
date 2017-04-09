import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reverse {
  public static void main(String[] args) {
    decrypt2("reverse.txt");
    decyprtReverse("reverse.txt");
  }

  public static void decyprtReverse(String text) {
    List<String> list = new ArrayList<>();
    Path filepath = Paths.get(text);
    try {
      list = Files.readAllLines(filepath);
      String myString = list.toString();
      char[] charArray = myString.toCharArray();
      for (int i = 0; i < charArray.length / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length - 1 - i];
        charArray[charArray.length - 1 - i] = temp;
      }
      System.out.println(charArray);
    } catch (Exception ex) {
      System.out.println("Cannot open file.");
    }
  }

  public static void decrypt2(String text) {
    List<String> list = new ArrayList<>();
    Path filepath = Paths.get(text);
    try {
      list = Files.readAllLines(filepath);
      String myString;
      for (int i = list.size() - 1; i >= 0; i--) {
        myString = list.get(i);
        myString = new StringBuffer(myString).reverse().toString();
        System.out.println(myString);
      }
    } catch (Exception ex) {
      System.out.println("Cannot open file.");
    }
  }
}