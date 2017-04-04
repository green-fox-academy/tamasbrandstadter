public class Tree extends Plant {
  private String color;

  Tree(String color, int currentWater, int maxWater) {
    super(currentWater, 10, maxWater);
    this.color = color;
  }

  public void waterLevel() {
    setCurrentWater(10);
  }
}
