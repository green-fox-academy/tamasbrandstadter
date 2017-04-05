import java.util.ArrayList;

public class Sum {
  private ArrayList<Integer> myIntArrayList;

  public Sum() {

  }

  public int sumIntegers(ArrayList<Integer> myIntArrayList) {
    int sum = 0;
    for (int i = 0; i < myIntArrayList.size() ; i++) {
      sum += myIntArrayList.get(i);
    }
    return sum;
  }
}
