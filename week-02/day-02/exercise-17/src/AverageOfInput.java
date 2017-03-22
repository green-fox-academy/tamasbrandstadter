import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    int userInput2 = scanner.nextInt();
    int userInput3 = scanner.nextInt();
    int userInput4 = scanner.nextInt();
    int userInput5 = scanner.nextInt();
    int sum = userInput+userInput2+userInput3+userInput4+userInput5;

    System.out.println("Sum: " + sum + ", " + "Avg: " + sum/5);

  }
}
