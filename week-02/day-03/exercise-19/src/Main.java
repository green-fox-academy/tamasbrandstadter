public class Main {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};

    for (int i = 0; i < aj.length / 2; i++) {
      int temp = aj[i];
      aj[i] = aj[aj.length - 1 - i];
      aj[aj.length - 1 - i] = temp;
    }

    for (int reverse : aj) {
      System.out.println(reverse);
    }
  }
}