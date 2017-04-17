import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> abcArrayList = new ArrayList<>();
    abcArrayList.add("first");
    abcArrayList.add("second");
    abcArrayList.add("third");
    Collections.swap(abcArrayList, 0, 2);
    System.out.println(abcArrayList);
  }
}