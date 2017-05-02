public class SingleValueAnnotation {
  public static void main(String[] args) {
    Screen screen = new Screen(640, 480);
    System.out.println(screen.getResolution());
    Screen43 screen43 = new Screen43(1024, 768);
    System.out.println(screen43.getResolution());
    Screen169 screen169 = new Screen169(1920, 1080);
    System.out.println(screen169.getResolution());
    Screen169 screen219 = new Screen169(2560, 1080);
    System.out.println(screen219.getResolution());
  }
}
