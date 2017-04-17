public class Plant {
  private String color;
  private double currentWater;
  private int minWater;
  private double absorbWater;
  private String name;

  public Plant(String color, int minWater, double absorbWater, String name) {
    this.color = color;
    this.currentWater = 0;
    this.minWater = minWater;
    this.absorbWater = absorbWater;
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public double getCurrentWater() {
    return currentWater;
  }

  public int getMinWater() {
    return minWater;
  }

  public String getName() {
    return name;
  }

  public void setCurrentWater(double currentWater) {
    this.currentWater = currentWater;
  }

  public double getAbsorbWater() {
    return absorbWater;
  }
}