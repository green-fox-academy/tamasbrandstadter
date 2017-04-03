public class Main {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("yellow", 130);
    sharpie1.use();
    System.out.println(sharpie1.inkAmount);
    Sharpie sharpie2 = new Sharpie("black", 20);
    sharpie2.use();
    System.out.println(sharpie2.inkAmount);
    sharpie1.use();
    System.out.println(sharpie1.inkAmount);
  }
}
