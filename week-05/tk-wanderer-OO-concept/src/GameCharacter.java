public class GameCharacter extends GameObject {

  private GameMap map;

  public GameCharacter(int posX, int posY, String costume, GameMap map) {
    super(posX, posY, costume);
    this.map = map;
  }

  public GameCharacter() {

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

}
