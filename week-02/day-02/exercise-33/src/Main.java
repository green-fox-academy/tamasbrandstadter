import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int) (Math.random() * 10) + 1;
    System.out.println(randomNumber);
    boolean win = false;
    while (!win) {
      System.out.println("Write a guess.");
      int guess = scanner.nextInt();
      if (guess == randomNumber) {
        System.out.println("You found the number.");
        win = true;
      } else if (randomNumber > guess) {
        System.out.println("Miss, the number is higher.");
      } else if (randomNumber < guess) {
        System.out.println("Miss, the number is lower.");
      }
    }
  }
}