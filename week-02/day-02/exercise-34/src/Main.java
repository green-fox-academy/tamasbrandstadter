import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int startingInput = scanner.nextInt();
    int count = 0;
    int sum = 0;
    while (count != startingInput) {
      int inputInteger = scanner.nextInt();
      sum += inputInteger;
      count++;
    }
    System.out.println("Sum: " + sum + ", " + "Avarage: " + sum / startingInput);
  }
}