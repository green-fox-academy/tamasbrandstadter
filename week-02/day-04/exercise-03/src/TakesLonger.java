public class TakesLonger {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder(" always takes longer than ");
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String s = quote.substring(0, 20);
    s += str + quote.substring(21);
    quote = s;
    System.out.println(quote);
  }
}
