public class Flower extends Plant {

  private String color;

  Flower(String color, int currentWater) {
    super(currentWater, 5);
    this.color = color;

  }

  public void waterLevel() {
    setCurrentWater(10);
  }

}


