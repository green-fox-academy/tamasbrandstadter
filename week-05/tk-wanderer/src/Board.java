import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  int[][] arrayForMap = new int[10][10];


  public Board() {

    testBoxX = 300;
    testBoxY = 300;

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


    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    graphics.fillRect(testBoxX, testBoxY, 72, 72);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.


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
//      for (int j = 0; j < 10; j++) {
//
//        PositionedImage image3 = new PositionedImage("assets/floor.png", j * 72, j * 72);
//        image3.draw(graphics);
  }


  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 100;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 100;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}

