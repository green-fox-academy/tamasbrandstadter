import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics){
    int x1 = 40;
    int y1 = 0;
    int x2 = 300;
    int y2 = 20;
    for (int i = 0; i < 13; i++) {
      graphics.setColor(new Color(75,0,130));
      graphics.drawLine(x1, 0, x2, y2);
      x1 = x1 + 20;
      y1 = y1 + 20;
      y2 = y2 + 20;
    }

    int xx1 = 0;
    int yy1 = 280;
    int xx2 = 300;
    int yy2 = 300;
    for (int j = 0; j < 14; j++) {
      graphics.setColor(Color.green);
      graphics.drawLine(xx1, yy1, xx2, yy2);
      yy1 = yy1 - 20;
      xx2 = xx2 - 20;
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