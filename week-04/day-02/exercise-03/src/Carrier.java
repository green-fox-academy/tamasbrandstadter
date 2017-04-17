import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircraftList;
  private int ammoStore;
  private int healthPoints;
  private int totalDamageOfCarrier;
  private Aircraft f16;
  private Aircraft f35;

  public Carrier(int ammoStore) {
    this.aircraftList = new ArrayList<>();
    this.ammoStore = ammoStore;
    this.healthPoints = 100;
    this.f16 = new F16();
    this.f35 = new F35();
    this.totalDamageOfCarrier = totalDamageOfCarrier;
  }

  public void addAirCraft(String type) {
    if (type.equals("F16")) {
      aircraftList.add(f16);
    } else if (type.equals("F35")) {
      aircraftList.add(f35);
    }
  }

  public int fill() {
    int ammoNeedForAircrafts = 0;
    int remainingAmmo = this.ammoStore;
    int givenAmmo = 0;
    System.out.println("Carrier remaining ammo before fill: " + remainingAmmo);
    for (Aircraft airCraftListForFill : aircraftList) {
      ammoNeedForAircrafts += airCraftListForFill.getMaxAmmo() - airCraftListForFill.getCurrentAmmo();
    }
    System.out.println("Total ammo need for aircrafts: " + ammoNeedForAircrafts);
    if (remainingAmmo == 0) {
      System.out.println("No ammo to fill.");
      return 0;
    }
    if (ammoNeedForAircrafts > remainingAmmo && remainingAmmo != 0) {
      for (Aircraft airCraftListForFill : aircraftList) {
        if (airCraftListForFill.getType().equals("F35")) {
          givenAmmo = remainingAmmo - airCraftListForFill.refill(remainingAmmo);
          remainingAmmo -= givenAmmo;
        }
        System.out.println("Ammo given to F35 when not enough for all: " + givenAmmo);
        System.out.println("Remaining ammo when not enough to all: " + remainingAmmo);
      }
    } else if (ammoNeedForAircrafts < remainingAmmo) {
      for (Aircraft airCraftListForFill : aircraftList) {
        givenAmmo += remainingAmmo - airCraftListForFill.refill(remainingAmmo);
      }
      remainingAmmo -= givenAmmo;
      System.out.println("Given ammo when enough for all:  " + givenAmmo);
      System.out.println("Remaining ammo when enough for all: " + remainingAmmo);
    }
    return remainingAmmo;
  }

  public List<Aircraft> getAircraftList() {
    return aircraftList;
  }

  public void fight(Carrier carrier) {
    carrier.healthPoints = this.healthPoints;
    int sumDamage = 0;
    System.out.println("Other carrier HP before fight: " + carrier.healthPoints);
    for (Aircraft airCraftListForFight : aircraftList) {
      sumDamage += airCraftListForFight.fight();
      carrier.healthPoints = this.healthPoints - sumDamage;
    }
    System.out.println("Other carrier HP after fight: " + carrier.healthPoints);
  }

  public String getStatus() {
    String returnString = "";
    for (int i = 0; i < aircraftList.size(); i++) {
      totalDamageOfCarrier += aircraftList.get(i).getDamage();
      returnString = "Aircraft count: " + aircraftList.size() + " Ammo storage: " + ammoStore + " Total damage: "
              + totalDamageOfCarrier + "\nAircrafts" + "\n" + aircraftList.get(i).getStatus();
    }
    return returnString;
  }
}