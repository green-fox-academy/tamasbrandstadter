import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkboard {

  public static void mainDraw(Graphics graphics) {
    int x;
    int y;
    int columns;
    int rows;

    for (rows = 0; rows < 8 ; rows++) {
      for (columns = 0; columns < 8; columns++) {
        x = columns * 20;
        y = rows * 20;
        if (columns % 2 == rows % 2) {
          graphics.setColor(Color.BLACK);
        } else {
          graphics.setColor(Color.WHITE);
        }
        graphics.fillRect(x, y, 20, 20);
      }
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

