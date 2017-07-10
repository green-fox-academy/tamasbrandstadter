import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  @Test
  void testForSplitOne() {
    List<String> testList = new ArrayList<>();
    testList.add("a");
    testList.add("bcd");
    testList.add("e");
    testList.add("fg");
    assertEquals(testList, Main.splitString("a,bcd,e,fg", ','));
  }

  @Test
  void testForSplitTwo() {
    List<String> testList = new ArrayList<>();
    testList.add("e");
    testList.add("xvj");
    testList.add("z");
    testList.add("1");
    assertEquals(testList, Main.splitStringOther("e,xvj,z,1", ','));
  }
}