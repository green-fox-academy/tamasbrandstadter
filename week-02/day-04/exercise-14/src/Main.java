import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String... args) {
    String out = "Never gonna give you up, never gonna let you down,\nNever gonna run around and desert you\nNever gonna make you cry, never gonna say goodbye\nNever gonna tell a lie and hurt you";
    int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

    Map<Integer, String> map = new HashMap<>();

    map.put(7, "run around and desert you");
    map.put(50, "tell a lie and hurt you");
    map.put(49, "make you cry,");
    map.put(2, "let you down");
    map.put(12, "give you up,");
    map.put(1, "Never gonna");
    map.put(11, "\n");
    map.put(3, "say goodbye");

    System.out.println(out);
  }
}