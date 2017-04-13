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
  private List<List<GameObject>> gameObjects;

  public GameMap() {
    this.gameObjects = new ArrayList<>(new ArrayList<>());
  }

  public void fillMap() {
    for (int i = 0; i < 10; i++) {
      List<GameObject> tempArrayList = new ArrayList<>();
      gameObjects.add(tempArrayList);
      for (int j = 0; j < 10; j++) {
        if (floorMap[j][i] == 1) {
          tempArrayList.add(new Wall(i * 72, j * 72, "assets/wall.png"));
        } else if (floorMap[j][i] == 0) {
          tempArrayList.add(new Floor(i * 72, j * 72, "assets/floor.png"));
        }
      }
    }
  }

  public List<List<GameObject>> getGameObjects() {
    return gameObjects;
  }

  public int[][] getFloorMap() {
    return floorMap;
  }
}
