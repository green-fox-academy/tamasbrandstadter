public class AppendA {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macs", "cic"};
    addA(nimals);
  }

  public static String[] addA(String[] nimals) {
    for (int i = 0; i < nimals.length; i++) {
      nimals[i] += "a";
      System.out.println(nimals[i]);
    }
    return nimals;
  }
}