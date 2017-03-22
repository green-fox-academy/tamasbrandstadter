import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    for (int i=0; i < userInput+1; i++)
    {
      for (int j=0; j<i; j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }

   }
}

