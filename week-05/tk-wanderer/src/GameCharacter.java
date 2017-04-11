public class GameCharacter {
  private int maxHP;
  private int currentHP;
  private int defendPoint;
  private int strikePoint;
  private String type;
  private int d6 = (int) (Math.random() * 6);

  public boolean isItDead(GameCharacter character) {
    return true;
  }

  public GameCharacter(String type) {
    if (this.type.equals("hero")) {
      this.maxHP = 20 + 3 * d6;
      this.defendPoint = 2 *
    }

    this.currentHP = currentHP;
    this.defendPoint = defendPoint;
    this.strikePoint = strikePoint;

  }
}


//        these values can change during the game
//        when a character's health point is 0 or below, it is dead
//        it disappears from the area
//        if its the hero, it is the end of the game
