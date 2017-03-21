import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput2 = scanner.nextInt();
    System.out.println((userInput2 * 0.621371192 + " in miles"));
  }
}
