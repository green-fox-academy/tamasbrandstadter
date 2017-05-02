@interface Monitor {
  String color() default "black";

  String type() default "Samsung";
}

@Monitor(color = "white", type = "EIZO")
public class Screen {
  private double height;
  private double width;
  private double resolution;

  public Screen(double width, double height) {
    this.height = height;
    this.width = width;
    this.resolution = width * height;
  }

  public double getResolution() {
    return resolution;
  }
}
