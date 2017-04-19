import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();
    for (int i = 0; i < 256; i++) {
      carList.add(new Car(Color.returnColor(), Types.returnType()));
    }
  }
}
