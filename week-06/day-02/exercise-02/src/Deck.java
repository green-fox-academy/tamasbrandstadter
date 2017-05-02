import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList;
    private List<Card> pulledCardList;

    public Deck() {
        this.cardList = new ArrayList<>();
        this.pulledCardList = new ArrayList<>();
    }

    public void fillDeck() {
        for (Color color : Color.values()) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cardList.add(new Card(rank.getValue(), suit.name(), color.name()));
                }
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cardList);
    }

    public Card pullFirst() {
        Card card = cardList.remove(0);
        pulledCardList.add(card);
        return card;
    }

    public Card pullLast() {
        Card card = cardList.remove(cardList.size() - 1);
        pulledCardList.add(card);
        return card;
    }

    public Card pullRandom() {
        Card card = cardList.remove(1 + (int) (Math.random() * 52));
        pulledCardList.add(card);
        return card;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (Card aCardList : cardList) {
            returnString.append(aCardList.getColor()).append(" ").append(aCardList.getValue()).append(" ")
                    .append(aCardList.getSuit()).append(" ");
        }
        System.out.println(returnString);
        System.out.println(cardList.size());
        return returnString.toString();
    }
}
