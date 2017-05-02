import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
  private Deck deck;
  private Scanner scanner = new Scanner(System.in);
  private List<Card> playerCards;

  public Game(Deck deck) {
    this.deck = deck;
    this.playerCards = new ArrayList<>();
  }

  public int randomNumberGenerator() {
    int randomNumber = (int) (Math.random() * (21 - 15) + 15);
    return randomNumber;
  }

  public void play(int randomNumber) {
    boolean gameOver = false;
    int sumOfCards = 0;
    deck.fillDeck();
    deck.shuffleDeck();
    while (!gameOver) {
      System.out.println("Do you want to draw?");
      String nextLine = scanner.nextLine();
      if (nextLine.equals("y")) {
        playerCards.add(deck.pullFirst());
        for (Card playerCard : playerCards) {
          sumOfCards += playerCard.getValue();
        }
        System.out.println("Sum of the cards: " + sumOfCards);
        if (sumOfCards > 21) {
          System.out.println("Game over. Sum of cards: " + sumOfCards);
          System.out.println("Computer score was: " + randomNumber);
          gameOver = true;
        }
      }
      if (nextLine.equals("n")) {
        System.out.println("Game over. Sum of cards: " + sumOfCards);
        System.out.println("Computer score was: " + randomNumber);
        gameOver = true;
      }
    }
  }
}
