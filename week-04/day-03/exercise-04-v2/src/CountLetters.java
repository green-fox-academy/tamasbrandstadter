import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public Map<Character, Integer> countLetters(String inputString) {
    Map<Character, Integer> returnedMap = new HashMap<>();
    char[] charArray = inputString.toCharArray();
    for (char i : charArray) {
      returnedMap.put(i, returnedMap.get(i) == null ? 1 : returnedMap.get(i) + 1);
    }
    return returnedMap;
  }
}
