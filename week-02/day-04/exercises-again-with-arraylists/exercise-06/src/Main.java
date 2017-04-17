import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> ag = new ArrayList<>();
    for (int i = 3; i < 8; i++) {
      ag.add(i);
    }
    System.out.println(ag);
    for (int i = 0; i < ag.size(); i++) {
      ag.set(i, ag.get(i) * 2);
    }
    System.out.println(ag);
  }
}