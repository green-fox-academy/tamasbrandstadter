public class String1 {
  public static void main(String[] args) {
    String text = "QWETzzGxxx";
    System.out.println(modifyX(text));
  }

  public static String modifyX(String str) {
    if (str.length() == 0) {
      return "";
    } if (str.charAt(0) == 'x') {
      return "y" + modifyX(str.substring(1));
    } else {
      return str.charAt(0) + modifyX(str.substring(1));
    }
  }
}
