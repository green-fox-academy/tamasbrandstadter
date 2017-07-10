import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println(splitString("a,bcd,e,fg", ','));
  }

  //Create a function takes a string and a letter and splits the string to an list of strings
  //by the letter like: "a,bcd,e,fg" and ','becomes ["a", "bcd", "e", "fg"]
  public static List<String> splitString(String inputString, char inputChar) {
    String tempString = "";
    List<String> returnList = new ArrayList<>();
    for (int i = 0; i < inputString.length(); i++) {
      if (inputString.charAt(i) == inputChar) {
        returnList.add(tempString);
        tempString = "";
      } else {
        tempString = tempString + inputString.charAt(i);
      }
    }
    returnList.add(tempString);
    return returnList;
  }
}

