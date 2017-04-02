import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

  public static void mainDraw(Graphics graphics) {
    int x = 150;
    int y = 150;
    int size = 200;
    drawSquares(graphics, x, y, size);
  }

  public static void drawSquares(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, size, size);
    if (size > 25) {
      drawSquares(graphics, x - size / 2 + size / 4, y - size / 2 + size/4, size / 2);
      drawSquares(graphics, x - size / 2 + size / 4, y + size / 2 + size/4, size / 2);
      drawSquares(graphics, x + size / 2 + size / 4, y - size / 2 + size/4, size / 2);
      drawSquares(graphics, x + size / 2 + size / 4, y + size / 2 + size/4, size / 2);
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