import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

  public static void mainDraw(Graphics graphics){
    int xPos = 10;
    int yPos = 10;
    int xSize = 10;
    int ySize = 10;

    for (int i = 0; i < 5; i++) {
      graphics.setColor(new Color(75,0,130));
      graphics.fillRect(xPos, yPos, xSize, ySize);
      xPos = xPos + xSize;
      yPos = yPos + ySize;
      xSize = xSize + xPos / 3;
      ySize = ySize + yPos / 3;
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