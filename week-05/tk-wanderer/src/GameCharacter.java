public class GameCharacter {
  private int maxHP;
  private int currentHP;
  private int defendPoint;
  private int strikePoint;
  private String type;
  private int d6 = (int) (Math.random() * 6) + 1;
  private int level;

  public GameCharacter(String type, int level) {
    if (this.type.equals("hero")) {
      this.maxHP = 20 + 3 * d6;
      this.defendPoint = 2 * d6;
      this.strikePoint = 5 + d6;
      this.currentHP = maxHP;
    } else if (this.type.equals("monster")) {
      this.maxHP = 2 * level * d6 + d6;
      this.defendPoint = level / 2 * d6 + (d6 / 2);
      this.strikePoint = level * d6 + level;
      this.currentHP = maxHP;
      this.level = level;
    }
  }

  public boolean isItDead(GameCharacter character) {
    if (character.currentHP == 0) {
    }
    return true;
  }
}

