public class Plant {
  private int minWater;
  private int maxWater;
  private int currentWater;

  Plant() {

  }

  Plant(int currentWater, int minWater, int maxWater) {
    this.minWater = minWater;
    this.maxWater = maxWater;
    this.currentWater = currentWater;
  }

  public void setCurrentWater(int plusWater) {
    this.currentWater += plusWater;
  }

  public boolean needsWater() {
    return (getCurrentWater() < minWater);

  }

  public int getCurrentWater() {
    return currentWater;
  }
}

