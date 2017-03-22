import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    int userInput2 = scanner.nextInt();

    if (userInput2 <= userInput) {
      System.out.println("The second number should be bigger.");
    }
    else {
      for (int i = userInput; i < userInput2 ; i++) {
        System.out.println(i);
      }
    }

  }
}
