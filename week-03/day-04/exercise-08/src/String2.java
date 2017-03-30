public class String2 {
  public static void main(String[] args) {
    String text = "QWETzzGxxxJgkxxxxxghhj";
    System.out.println(removeX(text));
  }

  public static String removeX(String str) {
    if (!str.contains("x")) {
      return str;
    } else if (str.charAt(0) == 'x') {
      return "" + removeX(str.substring(1));
    } else {
      return str.charAt(0) + removeX(str.substring(1));
    }
  }
}
