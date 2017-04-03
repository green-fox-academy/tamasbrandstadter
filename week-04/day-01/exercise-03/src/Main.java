import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Dominoes> dominoes = initializeDominoes();
    for (int i = 0; i < dominoes.size(); i++) {
      int newValue1 = dominoes.get(i).getValues()[1];
      for (int j = i + 1; j < dominoes.size(); j++) {
        int newValue2 = dominoes.get(j).getValues()[0];
        if (newValue1 == newValue2) {
          Collections.swap(dominoes, i + 1, j);
        }
      }
    }
    System.out.println(dominoes);
  }

  static List<Dominoes> initializeDominoes() {
    List<Dominoes> dominoes = new ArrayList<>();
    dominoes.add(new Dominoes(5, 2));
    dominoes.add(new Dominoes(4, 6));
    dominoes.add(new Dominoes(1, 5));
    dominoes.add(new Dominoes(6, 7));
    dominoes.add(new Dominoes(2, 4));
    dominoes.add(new Dominoes(7, 1));
    return dominoes;
  }
}