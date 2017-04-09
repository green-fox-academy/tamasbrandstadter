import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();

    try {
      int result = 12 / divisor;
      System.out.println(result);
    } catch (ArithmeticException ex) {
      System.out.println("Can't divide by zero!");
    }
  }
}