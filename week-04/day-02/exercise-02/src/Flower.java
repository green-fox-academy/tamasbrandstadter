public class Flower extends Plant {

  private String color;

  Flower(String color, int currentWater, int maxWater) {
    super(currentWater, 5, maxWater);
    this.color = color;
  }

  public void waterLevel() {
    setCurrentWater(10);
  }
}


