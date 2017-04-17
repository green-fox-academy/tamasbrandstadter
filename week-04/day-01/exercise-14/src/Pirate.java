public class Pirate {
  private int intoxicated;
  private boolean isHePassedOut;
  private boolean isHeDead;
  private String name;

  public Pirate(String name) {
    this.intoxicated = 0;
    this.isHePassedOut = false;
    this.isHeDead = false;
    this.name = name;
  }

  public void drinkSomeRum() {
    this.intoxicated++;
  }

  public void drinkSomeRum(int randomConsume) {
    this.intoxicated += randomConsume;
  }

  public void howsItGoingMate() {
    if (isHeDead == true) {
      System.out.println("He is dead.");
    } else if (isHePassedOut == true) {
      System.out.println("He is passed out.");
    } else if (intoxicated >= 0 && intoxicated <= 4) {
      System.out.println("Pour me anudder!");
    }
    if (intoxicated > 4) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      isHePassedOut = true;
    }
  }

  public void die() {
    isHeDead = true;
  }

  public void brawl(Pirate pirate, Pirate otherPirate) {
    int randomNumber = (int) (Math.random() * 10) + 1;
    if (!otherPirate.isHeDead) {
      if (randomNumber >= 0 && randomNumber <= 3) {
        pirate.isHeDead = true;
        System.out.println("Pirate1 is dead.");
      } else if (randomNumber >= 4 && randomNumber <= 7) {
        otherPirate.isHeDead = true;
        System.out.println("Pirate2 is dead");
      } else {
        pirate.isHePassedOut = true;
        otherPirate.isHePassedOut = true;
        System.out.println("They both passed out.");
      }
    }
  }

  public String getName() {
    return name;
  }

  public int getIntoxicated() {
    return intoxicated;
  }

  public boolean isHePassedOut() {
    return isHePassedOut;
  }

  public boolean isHeDead() {
    return isHeDead;
  }
}
