import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(splitString("lovebarbara", 4)));
  }

  public static String[] splitString(String inputString, int index) {
    String[] returnArray = new String[2];
    try {
      returnArray[0] = inputString.substring(0, index);
      returnArray[1] = inputString.substring(index, inputString.length());
      return returnArray;
    } catch (ArrayIndexOutOfBoundsException ex) {
      ex.printStackTrace();
      System.out.println("Array index out of bounds.");
    }
    return returnArray;
  }
}
