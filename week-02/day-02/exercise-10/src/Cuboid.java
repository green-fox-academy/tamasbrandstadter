/**
 * Created by dr. Brandstädter Tamás on 2017.03.21..
 */
public class Cuboid {
  public static void main(String[] args) {
    double side1 = 5;
    double side2 = 10;
    double side3 = 20;
    double volume = side1 * side2 * side3;
    double surface = 2 * (side1 * side2 + side1 * side3 + side2 * side3);
    System.out.println("Surface area: " + surface);
    System.out.println("Volume: " + volume);
  }
}
