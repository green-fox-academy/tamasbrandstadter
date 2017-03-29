import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Random randomNumber = new Random();

    System.out.println("Please give minimum range:");
    int minRange = reader.nextInt();
    System.out.println("Please give maximum range:");
    int maxRange = reader.nextInt();
    int answer = randomNumber.nextInt(minRange + maxRange);

    System.out.println("I've the number between " + minRange + " - " + maxRange + "." + " You have 5 lives.");
    System.out.println(answer);

    int count = 5;
    int userguess;
    boolean win = false;

    while (!win) {
      userguess = reader.nextInt();
      count--;
      if (userguess == answer) {
        System.out.println("You won.");
        win = true;
      }
      else if (userguess > answer) {
        System.out.println("Too high. " + " Lives left: " + count);
      }
      else if (userguess < answer) {
        System.out.println("Too low." + " Lives left: " + count);
      }
      if (count == 0) {
        System.out.println("Game is over.");
        break;
      }
    }
  }
}


