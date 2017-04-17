import java.util.Arrays;

public class Anagram {

  public static boolean isItAnagram(String inputString1, String inputString2) {
    if (inputString1.length() != inputString2.length()) {
      return false;
    }
    inputString1.toLowerCase();
    inputString2.toLowerCase();
    char[] charArray1 = inputString1.toCharArray();
    char[] charArray2 = inputString2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    String sortedInput1 = new String(charArray1);
    String sortedInput2 = new String(charArray2);
    if (sortedInput1.equals(sortedInput2)) {
      return true;
    }
    return false;
  }
}