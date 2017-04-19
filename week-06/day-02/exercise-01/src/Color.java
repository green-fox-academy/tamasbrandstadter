public enum Color {
  BLACK, WHITE, BLUE, RED, YELLOW, GREEN;

  static Color returnColor() {
    return values()[(int) (Math.random() * values().length)];

  }
}
