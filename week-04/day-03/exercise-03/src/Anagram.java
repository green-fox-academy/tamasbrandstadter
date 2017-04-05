import java.util.ArrayList;

public class Anagram {

  ArrayList<Character> firstArrayList = new ArrayList<>();
  ArrayList<Character> secondArrayList = new ArrayList<>();

  public boolean areTheyAnagrams(String text1, String text2) {
    for (char c : text1.toCharArray()) {
      firstArrayList.add(c);
    }
    System.out.println(firstArrayList);

    for (char d : text2.toCharArray()) {
      secondArrayList.add(d);
    }
    System.out.println(secondArrayList);

    if (firstArrayList.size() == secondArrayList.size() && secondArrayList.containsAll(firstArrayList) && firstArrayList.containsAll(secondArrayList)) {
      return true;
    } else {
      return false;
    }
  }
}





