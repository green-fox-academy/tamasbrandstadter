import java.util.Scanner;

public class Anagram {
  public static Scanner scanner = new Scanner(System.in);
  private String text1 = "alma";
  private String text2 = "maal";


  public boolean areTheyAnagrams(String text1, String text2) {
    this.text1 = text1;
    this.text2 = text2;
    if (text2.contains(text1) && text1.length() == text2.length()) {
      return true;
    } else {
      return false;
    }
  }
}
