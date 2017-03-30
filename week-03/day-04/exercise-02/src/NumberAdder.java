public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(addingRecursive(10));
  }

  public static int addingRecursive(int n) {
    int sum;
    if(n == 1) {
      return 1;
    }
    else {
      sum = n + addingRecursive(n-1);
      return sum;
    }
  }
}
