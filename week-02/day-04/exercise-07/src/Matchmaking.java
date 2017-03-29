import java.util.*;

public class Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

    int lenght = girls.size();

    ArrayList<String> order = new ArrayList<String>();
    for (int i = 0; i < lenght; i++) {
      order.add(girls.get(i) + ", " + boys.get(i));
    }

    System.out.println(order);
  }
}
