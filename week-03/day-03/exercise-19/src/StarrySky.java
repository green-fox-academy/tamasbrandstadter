import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarrySky {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,1200,1200);
    int width = 5;
    int height = 5;

    for (int i = 0; i < 100; i++) {
      double posX = Math.random() * 1000;
      double posY = Math.random() * 1000;
      graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
      graphics.fillRect((int) posX, (int) posY, width, height);
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