import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  @Test
  public void countLetters() throws Exception {
    CountLetters countLetters = new CountLetters();
    String text = "sadasdasd";
    assertEquals(1, (int)countLetters.countLetters(text).get("d"));
  }
}