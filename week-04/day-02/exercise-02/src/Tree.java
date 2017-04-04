public class Tree extends Plant {
  private String color;

  Tree(String color, int currentWater) {
    super(currentWater, 10);
    this.color = color;
  }

  public void waterLevel() {
   setCurrentWater(10);
  }
}
