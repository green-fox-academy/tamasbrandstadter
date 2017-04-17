import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountLettersTest {

  @Test
  void countLetters() {
    CountLetters countLetters = new CountLetters();
    assertEquals(1, countLetters.countLetters("dsfsdkljfsifopsk"));
  }
}