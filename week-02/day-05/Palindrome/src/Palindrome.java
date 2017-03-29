import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input1 = scanner.nextLine();
    System.out.println(createPalindrome(input1));
  }

  public static String createPalindrome (String text) {
    StringBuilder sb = new StringBuilder(text);
    for (int i = text.length() - 1; i >= 0; i--) {
      sb.append(sb.charAt(i));
    }
    return sb.toString();
  }
}