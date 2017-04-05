import java.util.ArrayList;

public class Anagram {

  ArrayList<Character> firstArrayList = new ArrayList<>();
  ArrayList<Character> secondArrayList = new ArrayList<>();

  public boolean areTheyAnagrams(String text1, String text2) {
    for (char c : text1.toCharArray()) {
      firstArrayList.add(c);
    }
    for (char d : text2.toCharArray()) {
      secondArrayList.add(d);
    }
    if (firstArrayList.size() == secondArrayList.size() && firstArrayList.containsAll(secondArrayList) && secondArrayList.containsAll(firstArrayList)) {
      return true;
    } else {
      return false;
    }
  }
}





