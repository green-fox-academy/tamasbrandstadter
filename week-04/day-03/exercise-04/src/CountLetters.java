import java.util.HashMap;

public class CountLetters {
  HashMap<Character, Integer> hm = new HashMap<>();

  public CountLetters() {
    this.hm = hm;
  }

  public HashMap<Character, Integer> countLetters(String text) {

    for (int i = 0; i < text.length(); i++) {
      if (hm != null) {
        hm.putIfAbsent(text.charAt(i), 1);
      } else {
        Integer count = hm.get(text.charAt(i));
        hm.putIfAbsent(text.charAt(i), count + 1);

      }

    }
    return hm;
  }
}
      

