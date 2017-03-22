import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    if (userInput <= 0) {
      System.out.println("Not enough.");
    }
    else if (userInput == 1){
      System.out.println("The number is one.");
    }
    else if (userInput == 2){
      System.out.println("The number is two.");
    }
    else {
      System.out.println("A lot.");
    }


  }
}
