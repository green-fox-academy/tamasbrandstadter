import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> farmList;
  private int freePlaces = 10;

  public Farm() {
    this.farmList = new ArrayList<>();
  }

  public void breed() {
    freePlaces--;
    if (freePlaces > 0) {
      farmList.add(new Animal(10, 10));
    } else {
      System.out.println("No free space.");
    }
  }

  public void slaughter() {
    for (int i = 0; i < farmList.size(); i++) {
      if (farmList.get(i).hunger > farmList.get(i + 1).hunger) {
        farmList.remove(i);
      }
    }
  }

  public int getFreePlaces() {
    return freePlaces;
  }
}