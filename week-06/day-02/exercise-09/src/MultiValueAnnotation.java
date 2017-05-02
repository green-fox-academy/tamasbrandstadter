import java.lang.annotation.Annotation;

public class MultiValueAnnotation {
  public static void main(String[] args) {
    Screen43 screen1 = new Screen43(640, 480);
    Screen169 screen2 = new Screen169(1920, 1080);
    Screen219 screen3 = new Screen219(2560, 1080);
    Class c = screen1.getClass();
    Annotation an = c.getAnnotation(Monitor.class);
    Monitor m = (Monitor) an;
  }
}
