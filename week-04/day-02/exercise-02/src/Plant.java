public class Plant {
  private int waterNeed;
  private int currentWater;
  private int color;

  public boolean needsWater() {
    return currentWater < waterNeed;
  }

  public int getWaterNeed() {
    return this.waterNeed;
  }

  public int getCurrentWater() {
    return this.currentWater;
  }

}

