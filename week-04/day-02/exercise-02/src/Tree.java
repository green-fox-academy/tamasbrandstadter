public class Tree extends Plant {
  private String color;

  @Override
  public boolean needsWater() {
    if (getCurrentWater() < 5) {
      return true;
    } else {
      return false;
    }
  }
}
