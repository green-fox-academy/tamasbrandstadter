import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
  private static List<String> testList;

  @BeforeAll
  static void initList() {
    testList = new ArrayList<>();
    testList.add("a");
    testList.add("bcd");
    testList.add("e");
    testList.add("fg");
  }

  @Test
  void testForReturnSplitOne() {
    assertEquals(testList, Main.splitString("a,bcd,e,fg", ','));
  }

  @Test
  void testForReturnSecondMethod() {
    assertEquals(testList, Main.splitStringOther("a,bcd,e,fg", ','));
  }

  @Test
  void testForElementOfList() {
    List<String> returnedList = Main.splitString("a,bcd,e,fg", ',');
    String s = testList.get(1);
    assertEquals(s, returnedList.get(1));
  }

  @Test
  void testForSize(){
    List<String> returnedList = Main.splitString("a,bcd,e,fg", ',');
    assertTrue(returnedList.size() == 4);
    assertTrue(returnedList.size() == testList.size());
  }
  
  @Test
  void testForSizeOther(){
    assertTrue(4 == Main.splitString("a,bcd,e,fg", ',').size());
  }
}