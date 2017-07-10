import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println(splitString("a,bcd,e,fg", ','));
    System.out.println(splitStringOther("a,bcd,e,fg", ','));
  }

  private static List<String> splitString(String inputString, char inputChar) {
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

  private static List<String> splitStringOther(String text, char separator) {
    List<String> returnList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char at = text.charAt(i);
      if (at == separator) {
        returnList.add(sb.toString());
        sb = new StringBuilder();
      } else {
        sb.append(at);
      }
    }
    returnList.add(sb.toString());
    return returnList;
  }
}

