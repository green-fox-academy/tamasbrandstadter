import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Monitor {
  String color() default "Black";

  String type() default "Samsung";

  String aspectRatio() default "4:3";

  String classification() default "TFT";
}

@Monitor
public class Screen {
  private double height;
  private double width;
  private double resolution;

  public enum size {INCH15, INCH17, INCH19, INCH21, INCH23, INCH25, INCH29, INCH34}

  public Screen(double width, double height) {
    this.height = height;
    this.width = width;
    this.resolution = width * height;
  }

  public double getResolution() {
    return resolution;
  }
}