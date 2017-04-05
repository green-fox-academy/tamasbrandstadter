import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {


  @Test
  public void testSumIntegers() throws Exception {
    Sum sum = new Sum();
    ArrayList<Integer> myIntArrayList = new ArrayList<>();
    for (int i = 0; i < 5 ; i++) {
      myIntArrayList.add(i, i+1);
    }
    assertEquals(15, sum.sumIntegers(myIntArrayList));
  }

  @Test
  public void testEmptyList() throws Exception {
    Sum sum = new Sum();
    ArrayList<Integer> myIntArrayList = new ArrayList<>();
    assertEquals(0, sum.sumIntegers(myIntArrayList));
  }

  @Test
  public void testOneSizeList() throws Exception {
    Sum sum = new Sum();
    ArrayList<Integer> myIntArrayList = new ArrayList<>();
    myIntArrayList.add(0,5);
    assertEquals(5, sum.sumIntegers(myIntArrayList));
  }


  @Test
  public void testNullList() throws Exception {
    Sum sum = new Sum();




  }




}