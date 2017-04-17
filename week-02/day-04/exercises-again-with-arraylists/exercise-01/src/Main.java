import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> q = new ArrayList<>();
    for (int i = 4; i < 8; i++) {
      q.add(i);
    }
    System.out.println(q.get(2));
  }
}