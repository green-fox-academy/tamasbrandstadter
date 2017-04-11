import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  private int testBoxX;
  private int testBoxY;
  //private int[][] arrayForMap = new int[10][10];
  private String heroDefault = "assets/hero-down.png";
  private String heroDown = "assets/hero-down.png";
  private String heroUp = "assets/hero-up.png";
  private String heroRight = "assets/hero-right.png";
  private String heroLeft = "assets/hero-left.png";
  private int currentPositionX;
  private int currentPositionY;
  private int[][] arrayForMap = {{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};

  public Board() {
    testBoxX = 0;
    testBoxY = 0;

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

  public int getPos(int x) {
    int pos = x / 72;
    return pos;
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
   this.currentPositionX = testBoxX;
   this.currentPositionY = testBoxY;

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (currentPositionY == 0 || (arrayForMap[getPos(testBoxY) - 1][getPos(testBoxX)] == 1)) {
      } else {
        testBoxY -= 72;
      }
      heroDefault = heroUp;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (currentPositionY == 648 || (arrayForMap[getPos(testBoxY) + 1][getPos(testBoxX)] == 1) ) {
      } else {
        testBoxY += 72;
      }
      heroDefault = heroDown;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (currentPositionX == 648 || (arrayForMap[getPos(testBoxY)][getPos(testBoxX) + 1] == 1)) {
      } else {
        testBoxX += 72;
      }
      heroDefault = heroRight;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (currentPositionX == 0 || (arrayForMap[getPos(testBoxY)][getPos(testBoxX) - 1] == 1) ) {
      } else {
        testBoxX -= 72;
      }
      heroDefault = heroLeft;
    }
    repaint();
  }
}

