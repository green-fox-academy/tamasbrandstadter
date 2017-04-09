import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    for (int i = 0; i < input; i++) {
      for (int j = 0; j < input; j++) {
        if (j == 0 || j == input || i == 0 || i == input)
          System.out.print("%");
        else {
          System.out.print(" ");
        }
      }
      System.out.println("%");
    }
    for (int i = 0; i <= input; i++) {
      System.out.print("%");
    }
  }
}