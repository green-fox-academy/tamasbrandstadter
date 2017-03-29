import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 3; i++) {
      int startX = (int) (Math.random() * 100);
      int startY = (int) (Math.random() * 100);
      drawSquare(graphics, startX, startY);
    }
  }

  public static void drawSquare (Graphics g, int x, int y) {
    for (int i = 0; i < 3; i++) {
      g.drawRect(x, y, 50, 50);
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