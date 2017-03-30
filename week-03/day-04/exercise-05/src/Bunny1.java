public class Bunny1 {
  public static void main(String[] args) {
    int bunnies = 5;
    System.out.println(bunnyEars(bunnies));
  }

  public static int bunnyEars (int bunnies) {
    if (bunnies == 1) {
      return 2;
    } else {
      return 2 + bunnyEars(bunnies-1);
    }
  }
}
