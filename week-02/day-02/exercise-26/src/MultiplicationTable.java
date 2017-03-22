import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    for (int i = 1; i < 11 ; i++) {
        System.out.println(i + " * " + userInput + " = " + userInput*i);
    }

  }
}