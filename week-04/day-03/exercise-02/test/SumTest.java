import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumIntegers() throws Exception {
    Sum sum = new Sum();
    ArrayList<Integer> myIntArrayList = new ArrayList<>();

    for (int i = 0; i < 5 ; i++) {
      myIntArrayList.add(i, i+1);
    }

    assertEquals(15, sum.sumIntegers(myIntArrayList));
  }
}