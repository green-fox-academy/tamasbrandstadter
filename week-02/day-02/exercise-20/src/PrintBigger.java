import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    int userInput2 = scanner.nextInt();

    if (userInput > userInput2) {
      System.out.println(userInput);
    }
    else {
      System.out.println(userInput2);
    }



  }
}