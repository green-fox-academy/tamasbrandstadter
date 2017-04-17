import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> aj = new ArrayList<>();
    for (int i = 3; i < 8; i++) {
      aj.add(i);
    }
    for (int i = 0; i < aj.size(); i++) {
      Collections.reverse(aj);
    }
    System.out.println(aj);
  }
}