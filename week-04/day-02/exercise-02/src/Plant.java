public class Plant {
  private int waterNeed;
  private int currentWater;
  private int color;


  public boolean needsWater() {
    if (currentWater < waterNeed) {
      return true;
    } else {
      return false;
    }
  }
}
