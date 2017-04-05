public class Flower extends Plant {
  private String color;

  Flower(String color, int currentWater, int maxWater) {
    super(currentWater, 5, maxWater);
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}


