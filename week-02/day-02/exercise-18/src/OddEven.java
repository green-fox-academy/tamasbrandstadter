import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    if (userInput%2 > 0) {
      System.out.println("The number is odd.");
    }
    else {
      System.out.println("The number is even.");
    }



  }
}
