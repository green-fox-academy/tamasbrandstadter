import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {
    int botLeftX1 = 0;
    int botLeftY1 = 150;
    int botLeftX2 = 150;
    int botLeftY2 = 170;
    for (int i = 0; i < 8; i++) {
      graphics.setColor(Color.green);
      graphics.drawLine(botLeftX1, botLeftY1, botLeftX2, botLeftY2);
      botLeftX1 += 20;
      botLeftY2 += 20;
    }

    int xx1 = 150;
    int yy1 = 130;
    int xx2 = 300;
    int yy2 = 150;
    for (int j = 0; j < 9; j++) {
      graphics.setColor(Color.green);
      graphics.drawLine(xx1, yy1, xx2, yy2);
      yy1 -= 20;
      xx2 -= 20;
    }

    int topLeftX1 = 0;
    int topLeftY1 = 150;
    int topLeftX2 = 150;
    int topLeftY2 = 130;
    for (int j = 0; j < 8; j++) {
      graphics.setColor(Color.green);
      graphics.drawLine(topLeftX1, topLeftY1, topLeftX2, topLeftY2);
      topLeftX1 += 20;
      topLeftY2 -= 20;
    }

    int botRightX1 = 150;
    int botRightY1 = 170;
    int botRightX2 = 300;
    int botRightY2 = 150;
    for (int j = 0; j < 8; j++) {
      graphics.setColor(Color.green);
      graphics.drawLine(botRightX1, botRightY1, botRightX2, botRightY2);
      botRightX2 -= 20;
      botRightY1 += 20;
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