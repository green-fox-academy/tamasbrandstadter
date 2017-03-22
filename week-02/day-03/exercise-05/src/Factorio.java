import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    System.out.println(factorio(userInput));
  }

  public static int factorio (int numbers) {
    int result = 1;
    for (int i = 1; i <= numbers ; i++) {
      result = result * i;
      }
    return result;
    }

}
