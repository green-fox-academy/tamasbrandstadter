import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plantList;

  public Garden() {
    this.plantList = new ArrayList<>();
  }

  public List<Plant> getPlantList() {
    return plantList;
  }

  public int needsWater() {
    int count = 0;
    for (Plant thirstyPlantList : plantList) {
      if (thirstyPlantList.getCurrentWater() < thirstyPlantList.getMinWater()) {
        count++;
        System.out.println("The " + thirstyPlantList.getColor() + " " + thirstyPlantList.getName() + " needs water.");
      } else {
        System.out.println("The " + thirstyPlantList.getColor() + " " + thirstyPlantList.getName() + " doesn't need water.");
      }
    }
    return count;
  }

  public void watering(int waterAmount, int count) {
    System.out.println("Watering with: " + waterAmount);
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).getCurrentWater() < plantList.get(i).getMinWater())
        plantList.get(i).setCurrentWater(waterAmount / count * getPlantList().get(i).getAbsorbWater());
    }
  }
}