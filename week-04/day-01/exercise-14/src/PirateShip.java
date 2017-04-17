import java.util.ArrayList;
import java.util.List;

public class PirateShip {
  private List<Pirate> pirateList;
  private Pirate captain;
  private int calculatedScore;

  public PirateShip() {
    this.captain = new Pirate("Captain");
    this.pirateList = new ArrayList<>();
    this.calculatedScore = getCalculatedScore();
  }

  public void fillShip() {
    pirateList.add(0, captain);
    int randomCrewNumber = (int) (Math.random() * 10) + 1;
    for (int i = 1; i < randomCrewNumber; i++) {
      pirateList.add(i, new Pirate("Pirate" + i));
    }
  }

  public void printShipInformation() {
    for (Pirate aliveList : pirateList) {
      if (!aliveList.isHeDead()) {
        System.out.println(aliveList.getName() + " is alive.");
      }
    }
  }

  public void printCaptainInformation(String captainID) {
    if (captainID.equals("Captain")) {
      System.out.println("Captain intoxicated: " + pirateList.get(0).getIntoxicated());
      System.out.println("Captain passed out(t/f) : " + pirateList.get(0).isHePassedOut());
    }
  }

  public boolean battle(PirateShip pirateShip, PirateShip otherPirateShip) {
    int randomCrewLoss = (int) (Math.random() * 10) + 1;
    int randomRumConsume = (int) (Math.random() * 10) + 1;
    boolean win = false;
    if (pirateShip.getCalculatedScore() > otherPirateShip.getCalculatedScore()) {
      for (int i = randomCrewLoss; i < otherPirateShip.pirateList.size(); i++) {
        otherPirateShip.pirateList.remove(i);
      }
      System.out.println("Pirateship 1 wins the battle.");
      System.out.println("Pirateship 2 crew after loss: " + otherPirateShip.pirateList.size());
      pirateShip.captain.drinkSomeRum(randomRumConsume);
      System.out.println("Pirateship 1 crew and the captain celebrates, captain intox: " + pirateShip.captain.getIntoxicated());
      win = true;
      return win;
    } else {
      for (int i = randomCrewLoss; i < pirateShip.pirateList.size(); i++) {
        pirateShip.pirateList.remove(i);
      }
      System.out.println("Pirateship 2 wins the battle.");
      System.out.println("Pirateship 1 crew after loss: " + pirateShip.pirateList.size());
      otherPirateShip.captain.drinkSomeRum(randomRumConsume);
      System.out.println("Pirateship 2 crew and the captain celebrates, captain intox: " + otherPirateShip.captain.getIntoxicated());
      return win;
    }
  }

  public Pirate getCaptain() {
    return captain;
  }

  public int getCalculatedScore() {
    return pirateList.size() - captain.getIntoxicated();
  }
}
