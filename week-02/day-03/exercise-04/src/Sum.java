import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    System.out.println(sum(userInput));
  }

  public static int sum (int numbers) {
    int result = 0;
    for (int i = 0; i <= numbers ; i++) {
      result = result + i;
    }
    return result;
  }
}