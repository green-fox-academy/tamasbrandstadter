import java.util.HashMap;

public class CountLetters {
  HashMap<String, Integer> hm = new HashMap<>();

  public CountLetters() {
    this.hm = hm;
  }

  public HashMap<String, Integer> countLetters(String text) {

    for (int i = 0; i < text.length(); i++) {
      if (!hm.containsKey((text.substring(i, i + 1)))) {
        hm.put(text.substring(i, i + 1), + 1);
      } else {
        hm.put(text.substring(i, i + 1), hm.get((text.substring(i, i + 1)) + 1));
      }
    }
    return hm;
  }
}

