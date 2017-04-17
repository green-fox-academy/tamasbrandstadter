import java.util.Scanner;

public class CowsAndBulls {
  private int numberToGuess;
  private boolean finishedGame;
  private int guesses;
  private Scanner scanner = new Scanner(System.in);

  public CowsAndBulls() {
    this.numberToGuess = (1000 + (int) (Math.random() * 9000));
    this.finishedGame = false;
    this.guesses = 0;
  }

  public String guessMethod() {
    System.out.println(numberToGuess);
    System.out.println("Guess a four digit number:");
    int bulls = 0;
    int cows = 0;
    String numberToGuessInString = Integer.toString(numberToGuess);
    while (!finishedGame) {
      String guess = scanner.nextLine();
      guesses++;
      bulls = 0;
      cows = 0;
      try {
        if (guess.length() != numberToGuessInString.length()) {
          System.out.println("Your guess is larger/shorter than 4 digits.");
          continue;
        }
      } catch (IndexOutOfBoundsException ex) {
        return "0";
      }
      for (int i = 0; i < 4; i++) {
        if (guess.charAt(i) == numberToGuessInString.charAt(i)) {
          bulls++;
        } else if (numberToGuessInString.contains(guess.charAt(i) + "")) {
          cows++;
        }
      }
      if (bulls == 4) {
        System.out.println("You won. Number of guesses: " + guesses);
        finishedGame = true;
      } else {
        System.out.println("Bulls number: " + bulls + " " + "Cows number: " + cows);
        System.out.println("Number of guesses: " + guesses);
      }
    }
    return "Bulls: " + bulls + " Cows: " + cows;
  }
}
