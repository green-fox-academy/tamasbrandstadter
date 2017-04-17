import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> nimals = new ArrayList<>();
    nimals.add("kuty");
    nimals.add("macsk");
    nimals.add("cic");
    for (int i = 0; i < nimals.size(); i++) {
      nimals.set(i, nimals.get(i) + "a");
    }
    System.out.println(nimals);
  }
}