import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> p1 = new ArrayList<>();
    ArrayList<Integer> p2 = new ArrayList<>();
    for (int i = 1; i < 4; i++) {
      p1.add(i);
    }
    p2.add(0, 4);
    p2.add(1, 5);
    if (p1.size() > p2.size()) {
      System.out.println("p1 is bigger");
    } else {
      System.out.println("p2 is bigger");
    }
  }
}