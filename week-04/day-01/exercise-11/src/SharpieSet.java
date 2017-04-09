import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> list;

  public SharpieSet() {
    list = new ArrayList<>();
  }

  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie : list) {
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for (Sharpie sharpie : list) {
      if (sharpie.inkAmount == 0) {
        list.remove(sharpie);
        System.out.println("Sharpie removed.");
      }
    }
  }
}
