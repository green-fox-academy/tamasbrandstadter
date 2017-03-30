public class String3 {
  public static void main(String[] args) {
    String text = "dsfsf";
    System.out.println(addingStars(text));
  }

  public static String addingStars(String str) {
    if (str.length()-1 < 1) {
      return str;
    } else {
      return str.substring(0, 1) + "*" + addingStars(str.substring(1));
    }
  }
}


