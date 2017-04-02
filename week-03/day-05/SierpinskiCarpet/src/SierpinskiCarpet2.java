import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet2 {

  public static void mainDraw(Graphics graphics) {
    int center = 150;
    int size = 100;
    drawSquares(graphics, center, center, size);
  }

  public static void drawSquares(Graphics graphics, int centerX, int centerY, int size) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(centerX - size / 2, centerY - size / 2, size, size);
    if (size > 0) {
      drawSquares(graphics, centerX - size, centerY - size, size / 3);
      drawSquares(graphics, centerX + size, centerY + size, size / 3);
      drawSquares(graphics, centerX - size, centerY + size, size / 3);
      drawSquares(graphics, centerX + size, centerY - size, size / 3);
      drawSquares(graphics, centerX, centerY - size, size / 3);
      drawSquares(graphics, centerX - size, centerY, size / 3);
      drawSquares(graphics, centerX, centerY + size, size / 3);
      drawSquares(graphics, centerX + size, centerY, size / 3);
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}