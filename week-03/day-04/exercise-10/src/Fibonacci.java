public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacciSequence(10));
  }

  public static int fibonacciSequence(int n) {
    if (n == 0) {
      return 0;
    }
    if (n <= 1) {
      return n;
    }
    else {
      return fibonacciSequence(n - 1) + fibonacciSequence(n-2);
    }
  }
}

