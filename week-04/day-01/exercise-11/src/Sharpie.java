public class Sharpie {
  private String color;
  private float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use(float usedInk) {
    this.inkAmount -= usedInk;
  }

  public float getInkAmount() {
    return inkAmount;
  }
}