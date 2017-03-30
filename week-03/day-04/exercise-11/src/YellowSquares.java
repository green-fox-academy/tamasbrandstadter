import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquares {

  public static void mainDraw(Graphics graphics){
    int width = 600;
    int height = 600;
    drawSquares(graphics,0,0, width, height);
  }

  public static void drawSquares(Graphics g, int x, int y, int width, int height){
    if (height == 0) {
      return;
    } else {
      g.setColor(Color.YELLOW);
      g.fillRect(x, y, width, height);
      g.setColor(Color.BLACK);
      g.drawRect(x, y, width, height);
      drawSquares(g, x + (width / 3), y, width / 3, height / 3);
      drawSquares(g, x, y + (height/3), width / 3, height / 3);
      drawSquares(g, x + (2*(width/3)), y + (height/3), width / 3, height / 3);
      drawSquares(g, x + (width / 3), y + (2*(height/3)), width / 3, height / 3);
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