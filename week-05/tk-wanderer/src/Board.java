import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  private int testBoxX;
  private int testBoxY;
  private int[][] arrayForMap = new int[10][10];
  private String heroDefault = "assets/hero-down.png";
  private String heroDown = "assets/hero-down.png";
  private String heroUp = "assets/hero-up.png";
  private String heroRight = "assets/hero-right.png";
  private String heroLeft = "assets/hero-left.png";


  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    arrayForMap[0][3] = 1;
    arrayForMap[0][5] = 1;
    arrayForMap[1][3] = 1;
    arrayForMap[1][5] = 1;
    arrayForMap[1][7] = 1;
    arrayForMap[1][8] = 1;
    arrayForMap[2][1] = 1;
    arrayForMap[2][2] = 1;
    arrayForMap[2][3] = 1;
    arrayForMap[2][3] = 1;
    arrayForMap[2][5] = 1;
    arrayForMap[2][7] = 1;
    arrayForMap[2][8] = 1;
    arrayForMap[3][5] = 1;
    arrayForMap[4][0] = 1;
    arrayForMap[4][1] = 1;
    arrayForMap[4][2] = 1;
    arrayForMap[4][3] = 1;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (arrayForMap[i][j] == 1) {
          PositionedImage wallImage = new PositionedImage("assets/wall.png", j * 72, i * 72);
          wallImage.draw(graphics);
        } else {
          PositionedImage floorImage = new PositionedImage("assets/floor.png", j * 72, i * 72);
          floorImage.draw(graphics);
        }
      }
    }
    PositionedImage heroImage = new PositionedImage(heroDefault, testBoxX, testBoxY);
    heroImage.draw(graphics);

  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    int currentPositionX = testBoxX;
    int currentPositionY = testBoxY;

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (currentPositionY == 0) {
        heroDefault = heroUp;
      } else {
        testBoxY -= 72;
        heroDefault = heroUp;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (currentPositionY == 720 - 72) {
        heroDefault = heroDown;
      } else {
        testBoxY += 72;
        heroDefault = heroDown;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (currentPositionX == 720 - 72) {
        heroDefault = heroRight;
      } else {
        testBoxX += 72;
        heroDefault = heroRight;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (currentPositionX == 0) {
        heroDefault = heroLeft;
      } else {
        testBoxX -= 72;
        heroDefault = heroLeft;
      }
      repaint();
    }
  }
}

