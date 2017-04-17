import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    for (int i = 3; i < 8; i++) {
      integerArrayList.add(i);
    }
    int sum = 0;
    for (Integer anIntegerArrayList : integerArrayList) {
      sum += anIntegerArrayList;
    }
    System.out.println(sum);
  }
}