public class BattleApp {
  public static void main(String[] args) {
    PirateShip pirateShip = new PirateShip();
    PirateShip pirateShip2 = new PirateShip();
    PirateShip pirateShip3 = new PirateShip();
    PirateShip pirateShip4 = new PirateShip();
    pirateShip.fillShip();
    pirateShip2.fillShip();
    pirateShip3.fillShip();
    pirateShip4.fillShip();
    pirateShip.printShipInformation();
    pirateShip.getCaptain().drinkSomeRum();
    pirateShip.printCaptainInformation("Captain");
    pirateShip2.printShipInformation();
    pirateShip2.printCaptainInformation("Captain");
    System.out.println("Pirateship 1 calculated score: " + pirateShip.getCalculatedScore());
    System.out.println("Pirateship 2 calculated score: " + pirateShip2.getCalculatedScore());
    pirateShip.battle(pirateShip, pirateShip2);
  }
}