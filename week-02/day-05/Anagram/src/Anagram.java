import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input1 = scanner.nextLine();
    String input2 = scanner.nextLine();
    System.out.println(isAnagram(input1, input2));
  }

  public static boolean isAnagram(String text1, String text2) {
    ArrayList<Character> firstArrayList = new ArrayList<Character>();
    ArrayList<Character> secondArrayList = new ArrayList<Character>();

    for (char c : text1.toCharArray()) {
      firstArrayList.add(c);
    }
    for (char d : text2.toCharArray()) {
      secondArrayList.add(d);
    }

    if (firstArrayList.size() > secondArrayList.size()){
      return false;
    }
    if (secondArrayList.size() > firstArrayList.size()){
      return false;
    }
    if (secondArrayList.contains(firstArrayList)) {
      return true;
    }
    else {
      return false;
    }
  }
}
