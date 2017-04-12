import java.util.ArrayList;
import java.util.List;

public class Map {
  private int[][] floorMap;
  private List<Wall<Floor>> gameObjects;


  public Map(int[][] floorMap) {
    this.floorMap = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};
    this.gameObjects = new ArrayList<>(new ArrayList<>());
  }


  public void fillMap() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (floorMap[i][j] == 1) {
          gameObjects.add(new Wall(i*72, j*72, "assets/floor.png"));

        } else {
          
        }

        }
      }
  }

}
