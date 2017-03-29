import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    graphics.drawLine(10, 10, 150, 10);
    graphics.setColor(Color.green);
    graphics.drawLine(150, 10, 150, 160);
    graphics.setColor(Color.red);
    graphics.drawLine(10, 10, 10, 160);
    graphics.setColor(Color.yellow);
    graphics.drawLine(10, 160, 150, 160);
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