public enum Suit {
    CLUBS(1), DIAMONDS(2), SPADES(3), HEARTS(4);

    private final int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
