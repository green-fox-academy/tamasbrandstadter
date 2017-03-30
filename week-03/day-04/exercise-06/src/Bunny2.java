public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(bunnyEars(3));
  }

  public static int bunnyEars(int bunnies) {
    if (bunnies == 1) {
      return 2;
    } else if (bunnies%2 == 0) {
      return 3 + bunnyEars(bunnies-1);
    } else {
      return 2 + bunnyEars(bunnies-1);
    }
  }
}
