public class Plant {

  private int currentWater;
  private int color;

  Plant(int currentWater) {
    this.currentWater = currentWater;
  }

  public void setCurrentWater(int plusWater) {
    this.currentWater += plusWater;
  }

  public boolean needsWater() {
    if (getCurrentWater() < 5) {
      return true;
    } else {
      return false;
    }
  }

  public int getCurrentWater() {
    return currentWater;
  }
}

