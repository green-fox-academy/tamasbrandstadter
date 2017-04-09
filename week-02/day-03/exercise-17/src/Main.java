public class Main {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};

    String tempElement = abc[0];
    abc[0] = abc[2];
    abc[2] = tempElement;

    for (String s : abc) {
      System.out.println(s);
    }
  }
}