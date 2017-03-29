public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht , dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(reverser(reversed));
  }

  public static String reverser(String text) {
    StringBuilder sb = new StringBuilder(text);
    for (int i = text.length() - 1; i>= 0; i--) {
      sb.append(sb.charAt(i));
    }
    return sb.toString();
  }
}
