public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String s = url.substring(0,5);
    s += ":";
    s += url.substring(5);
    url = url.replace("bots", "odds");
    System.out.println(s);
  }
}
