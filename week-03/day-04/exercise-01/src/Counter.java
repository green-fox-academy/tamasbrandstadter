public class Counter {
  public static void main(String[] args) {
    System.out.println(countRecursive(5));
  }

  public static int countRecursive(int n) {
    if (n == 1) {
      return 1;
    } else {
      System.out.println(n);
      return countRecursive(n-1);
    }
  }
}
