import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

  public static void mainDraw(Graphics graphics) {
    int[] points = {10, 10, 290, 10, 10, 290, 290, 290};
    connectDots(graphics, points);
  }

  public static void connectDots(Graphics graphics, int[] points) {
    graphics.setColor(Color.green);
    graphics.drawLine(points[0], points[1], points[2], points[3]);
    graphics.drawLine(points[4], points[5], points[6], points[7]);
    graphics.drawLine(points[0], points[1], points[4], points[5]);
    graphics.drawLine(points[2], points[3], points[6], points[7]);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}