public class Sumdigit {
  public static void main(String[] args) {
    System.out.println(sumDigits(126));

  }

  public static int sumDigits(int n) {
    if (n%10 == n) {
      return n;
    }
    else {
      int rightdigit;
      rightdigit = n%10;
      return rightdigit + sumDigits(n / 10);
    }
  }
}
