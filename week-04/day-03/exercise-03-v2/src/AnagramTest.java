import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {
  @Test
  void isItAnagram() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.isItAnagram("class", "ssacl"));
  }
}