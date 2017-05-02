@interface Monitor {
  String color() default "Black";

  String type() default "Samsung";

  String aspectRatio() default "4:3";
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
