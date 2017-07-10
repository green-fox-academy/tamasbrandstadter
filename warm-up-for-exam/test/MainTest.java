import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  private static List<String> testList;

  @BeforeAll
  public static void initObjects() {
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
}