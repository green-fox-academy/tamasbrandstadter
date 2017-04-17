import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > a && b > c)
      return b;
    else {
      return c;
    }
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    System.out.println(pool);
    double median;
    if (pool.size() % 2 == 0) {
      median = ((double) pool.get(pool.size() / 2 - 1) + (double) pool.get(pool.size() / 2)) / 2;
      return median;
    } else {
      median = (double) pool.get(pool.size() / 2);
    }
    return median;
  }

  boolean isVowel(char c) {
    char ch = Character.toLowerCase(c);
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(ch);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}