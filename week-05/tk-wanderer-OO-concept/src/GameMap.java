import java.util.ArrayList;
import java.util.List;

public class GameMap {
  public static int[][] floorMap = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};
  private List<GameObject> gameObjects;
  private List<GameObject> characterList;


  public GameMap() {
    this.gameObjects = new ArrayList<>();
    this.characterList = new ArrayList<>();
  }

  public void fillMap() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (floorMap[j][i] == 1) {
          gameObjects.add(new Wall(i * 72, j * 72, "assets/wall.png"));
        } else if (floorMap[j][i] == 0) {
          gameObjects.add(new Floor(i * 72, j * 72, "assets/floor.png"));
        }
      }
    }
  }

  public boolean isItFloor(int posX, int posY) {
    for (GameObject g : gameObjects) {
      if (g.getPosX() == posX && g.getPosY() == posY) {
        GameObject floor = new Floor();
        g.getClass().equals(floor.getClass());
        return false;
      }
    }
    return true;
  }

  public boolean isCharacter(int posX, int posY) {
    for (GameObject g : characterList) {
      if (g.getPosX() == posX && g.getPosY() == posY) {
        return true;
      }
    }
    return false;
  }

  public List<GameObject> getCharacterList() {
    return characterList;
  }

  public List<GameObject> getGameObjects() {
    return gameObjects;
  }

  public int[][] getFloorMap() {
    return floorMap;
  }

  public int[] randCoordinate() {
    int[] randomCoordinate = new int[2];
    int x = (int) (Math.random() * 10) * 72;
    int y = (int) (Math.random() * 10) * 72;
    while ((isCharacter(x, y) == true) && (isItFloor(x, y) == false)) {
      x = (int) (Math.random() * 10) * 72;
      y = (int) (Math.random() * 10) * 72;
    }
    randomCoordinate[0] = x;
    randomCoordinate[1] = y;
    return randomCoordinate;
  }
}





