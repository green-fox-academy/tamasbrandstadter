import java.util.ArrayList;

public class Sum {
  private ArrayList<Integer> myIntArrayList;

  public Sum() {
    myIntArrayList = new ArrayList<>();
  }

  public int sumIntegers(ArrayList<Integer> myIntArrayList) {
    int sum = 0;
    if (myIntArrayList != null) {
      for (int i = 0; i < myIntArrayList.size(); i++) {
        sum += myIntArrayList.get(i);
      }
    }
    return sum;
  }
}
