import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameEngine extends JComponent {
  private GameMap map;

  public GameEngine() {
    this.map = new GameMap();
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

   @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    map.fillMap();
    for (List<GameObject> list : map.getGameObjects())  {
      for (GameObject temp : list) {
      PositionedImage image = new PositionedImage(temp.getCostume(), temp.getPosX(), temp.getPosY());
      image.draw(graphics);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    GameEngine gameEngine = new GameEngine();
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
  }





}

