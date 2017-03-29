import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < 3; i++) {
      int randomNumber1 = (int)(Math.random() * 100);
      int randomNumber2 = (int)(Math.random() * 100);
      drawFunction(graphics, randomNumber1, randomNumber2);
    }
  }

  public static void drawFunction (Graphics g, int randomNumber1, int randomNumber2) {
    int secondXCoordinate = 150;
    int secondYCoordinate = 150;
    g.drawLine(randomNumber1, randomNumber2, secondXCoordinate, secondYCoordinate);
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