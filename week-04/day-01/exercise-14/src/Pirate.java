public class Pirate {
  private int toxicated;
  private String name;
  private boolean isHePassedOut;
  private boolean isHeDead;

  public Pirate(String name) {
    this.toxicated = 0;
    this.name = name;
    this.isHePassedOut = false;
    this.isHeDead = false;
  }

  public boolean drinkSomeRum() {
    if (die()) {
      System.out.println("He's dead.");
    } else {
      toxicated++;
    }
    return true;
  }

  public void howsItGoingMate() {
    if (toxicated < 4) {
      System.out.println("Pour me anudder");
    }
    if (die()) {
      System.out.println("He's dead.");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passOut();
    }
  }

  private boolean die() {
    return isHeDead = true;
  }

  public boolean passOut() {
    return isHePassedOut = true;
  }

  public void brawl(Pirate pirate) {
    if (pirate.isHeDead) {

    }
  }

}
