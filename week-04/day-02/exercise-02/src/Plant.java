public class Plant {
  private int minWater;
  private int currentWater;

  Plant() {


  }

  Plant(int currentWater, int minWater) {
    this.minWater = minWater;
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

