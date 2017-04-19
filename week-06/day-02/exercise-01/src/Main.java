import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();
    for (int i = 0; i < 256; i++) {
      carList.add(new Car(Color.returnColor(), Types.returnType()));
    }

    int sumPorsche = 0;
    int sumFerrai = 0;
    int sumAudi = 0;
    int sumBmw = 0;
    int sumLamborghini = 0;
    int sumMercedes = 0;

    for (int i = 0; i < carList.size(); i++) {
      if (carList.get(i).getType().equals(Types.PORSCHE)) {
        sumPorsche++;
      }
      if (carList.get(i).getType().equals(Types.FERRARI)) {
        sumFerrai++;
      }
      if (carList.get(i).getType().equals(Types.AUDI)) {
        sumAudi++;
      }
      if (carList.get(i).getType().equals(Types.MERCEDES)) {
        sumMercedes++;
      }
      if (carList.get(i).getType().equals(Types.LAMBORGHINI)) {
        sumLamborghini++;
      }
      if (carList.get(i).getType().equals(Types.BMW)) {
        sumBmw++;
      }
    }
    System.out.println("Sum of Porshe: " + sumPorsche + " Sum of Audi: " + sumAudi + " Sum of Ferrari: " + sumFerrai +
            " Sum of BMW: " + sumBmw + " Sum of Lamborghini: " + sumLamborghini + " Sum of Mercedes: " + sumMercedes);
  }
}
