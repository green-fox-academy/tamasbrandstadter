import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics) {

    Color[] color = {Color.red, Color.blue, Color.black, Color.green};
    for (int i = 0; i < 100; i++) {
      int c = (i + 4) % 4;
      rainBowSquare(graphics, (i + 1) * 30, color[c]);
    }
  }

  public static void rainBowSquare (Graphics g, int size, Color color) {
    g.setColor(color);
    int centerX = 150;
    int centerY = 150;
    g.drawRect(centerX-size/2, centerY-size/2, size, size);
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