import java.util.List;

public class Garden {
  private List<Plant> plantList;

  public void add(Plant plant) {
    plantList.add(plant);
  }

  public int countThirstyPlant() {
    int counter = 0;
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).needsWater()) {
        counter++;
      }
    }
    return counter;
  }

  public void watering(int amount) {
    amount = amount / countThirstyPlant();
    for (int i = 0; i < plantList.size() ; i++) {
      if (plantList.get(i).needsWater()) {
        plantList.get(i).setCurrentWater(amount);
      }
    }
  }
}
