public class Card {
    private int value;
    private String color;
    private String suit;

    public Card(int value, String suit, String color) {
        this.value = value;
        this.color = color;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public String getSuit() {
        return suit;
    }
}
