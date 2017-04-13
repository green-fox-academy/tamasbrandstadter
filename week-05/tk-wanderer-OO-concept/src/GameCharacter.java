import java.util.ArrayList;
import java.util.List;

public class GameCharacter extends GameObject {

  private List<GameObject> characterList;
  private GameMap map;

  public GameCharacter(int posX, int posY, String costume, GameMap map) {
    super(posX, posY, costume);
    this.characterList = new ArrayList<>();
    this.map = map;
  }

  public void moveUp() {
    if ((getPosY() - 72) >= 0 && (GameMap.floorMap[getPosY()/72 - 1][getPosX()/72] != 1)) {
      move(0, -72);
    }
  }

  public void moveDown() {
    if ((getPosY() - 72) < 720 && (GameMap.floorMap[getPosY()/72 + 1][getPosX()/72] != 1)) {
      move(0, 72);
    }
  }

  public void moveLeft(){
    if ((getPosX() - 72) >= 0 && (GameMap.floorMap[getPosY()/72][getPosX()/72 - 1] != 1)) {
      move(-72, 0);
    }
  }

  public void moveRight(){
    if ((getPosX() - 72) < 720 && (GameMap.floorMap[getPosY()/72][getPosX()/72 + 1] != 1)) {
      move(+72, 0);
    }
  }

  public List<GameObject> getCharacterList() {
    return characterList;
  }
}
