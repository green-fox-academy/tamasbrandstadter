public enum Types {
  PORSCHE, FERRARI, AUDI, BMW, MERCEDES, LAMBORGHINI;

  static Types returnType() {
    return values()[(int) (Math.random() * values().length)];
  }
}



