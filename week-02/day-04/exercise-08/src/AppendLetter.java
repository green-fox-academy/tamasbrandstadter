import java.util.*;

public class AppendLetter {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs"));
    String first = far.toString();
    String second = far.toString();
    String third = far.toString();

    first = first.substring(1,5) + "a";
    second = second.substring(7, 12) + "a";
    third = third.substring(14, 18) + "a";

    far.set(0, first);
    far.set(1, second);
    far.set(2, third);

    System.out.println(far);
  }
}
