import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    String temp = list.get(5);
    String temp2 = list.get(2);
    list.set(2, temp);
    list.set(5, temp2);
    String newString = list.toString();
    newString = newString.replace(",", "");
    System.out.println(newString);
  }
}
