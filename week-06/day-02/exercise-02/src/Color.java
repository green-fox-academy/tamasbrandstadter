public enum Color {
    RED(1), BLACK(2);

    private final int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


