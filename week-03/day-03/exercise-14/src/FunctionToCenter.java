import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;

    for (int i = 0; i < 16; i++) {
      lineDrawing(graphics, x, 0);
      lineDrawing(graphics, 300, y);
      lineDrawing(graphics, x, 300);
      lineDrawing(graphics, 0, y);
      x += 20;
      y += 20;
    }
  }

  public static void lineDrawing(Graphics graphics, int x, int y) {
    int centerX = 150;
    int centerY = 150;
    graphics.drawLine(x, y, centerX, centerY);
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