import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static int steps = 7;

  public static void mainDraw(Graphics graphics){
    int width = 500;
    int height = 500;
    drawBigTriangle(graphics, 10, 0, width-10, 0, width/2, height-10, Color.black);
  }

  public static void drawBigTriangle(Graphics graphics, double x1, double y1, double x2, double y2, double x3, double y3, Color color) {
    graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    graphics.drawLine((int) x1, (int) y1, (int) x3, (int) y3);
    graphics.drawLine((int) x2, (int) y2, (int) x3, (int) y3);
    subTriangle(graphics, 2, (x1+x2)/2, (y1+y2)/2, (x2+x3)/2, (y2+y3)/2, (x1+x3)/2, (y1+y3)/2, color);
  }

  public static void subTriangle(Graphics graphics, int n, double x1, double y1, double x2, double y2, double x3, double y3, Color color) {

    graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    graphics.drawLine((int) x1, (int) y1, (int) x3, (int) y3);
    graphics.drawLine((int) x2, (int) y2, (int) x3, (int) y3);

    if (n < steps) {
     graphics.setColor(Color.YELLOW);
     subTriangle(graphics, n + 1, (x1 + x2) / 2 + (x2 - x3) / 2, (y1 + y2) / 2 + (y2 - y3) / 2, (x1 + x2) / 2 + (x1 - x3) / 2, (y1 + y2) / 2 + (y1 - y3) / 2, (x1 + x2) / 2, (y1 + y2) / 2, color);
     graphics.setColor(Color.GREEN);
     subTriangle(graphics, n + 1, (x3 + x2) / 2 + (x2 - x1) / 2, (y3 + y2) / 2 + (y2 - y1) / 2,  (x3 + x2) / 2 + (x3 - x1) / 2, (y3 + y2) / 2 + (y3 - y1) / 2, (x3 + x2) / 2, (y3 + y2) / 2, color);
      graphics.setColor(Color.BLUE);
     subTriangle(graphics, n + 1, (x1 + x3) / 2 + (x3 - x2) / 2, (y1 + y3) / 2 + (y3 - y2) / 2,  (x1 + x3) / 2 + (x1 - x2) / 2, (y1 + y3) / 2 + (y1 - y2) / 2, (x1 + x3) / 2, (y1 + y3) / 2, color);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

