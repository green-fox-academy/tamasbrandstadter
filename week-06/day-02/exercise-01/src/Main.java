import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();
    for (int i = 0; i < 256; i++) {
      carList.add(new Car(Color.returnColor(), Types.returnType()));
    }

    int sumPorsche = 0;
    int sumFerrari = 0;
    int sumAudi = 0;
    int sumBmw = 0;
    int sumLamborghini = 0;
    int sumMercedes = 0;
    int sumBlack = 0;
    int sumWhite = 0;
    int sumYellow = 0;
    int sumBlue = 0;
    int sumGreen = 0;
    int sumRed = 0;

    for (int i = 0; i < carList.size(); i++) {
      if (carList.get(i).getType().equals(Types.PORSCHE)) {
        sumPorsche++;
      }
      if (carList.get(i).getType().equals(Types.FERRARI)) {
        sumFerrari++;
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
      if (carList.get(i).getColor().equals(Color.BLACK)) {
        sumBlack++;
      }
      if (carList.get(i).getColor().equals(Color.WHITE)) {
        sumWhite++;
      }
      if (carList.get(i).getColor().equals(Color.RED)) {
        sumRed++;
      }
      if (carList.get(i).getColor().equals(Color.YELLOW)) {
        sumYellow++;
      }
      if (carList.get(i).getColor().equals(Color.BLUE)) {
        sumBlue++;
      }
      if (carList.get(i).getColor().equals(Color.GREEN)) {
        sumGreen++;
      }
    }
    System.out.println("Sum of Porshe: " + sumPorsche + " Sum of Audi: " + sumAudi + " Sum of Ferrari: " + sumFerrari +
            " Sum of BMW: " + sumBmw + " Sum of Lamborghini: " + sumLamborghini + " Sum of Mercedes: " + sumMercedes);
    System.out.println("Sum of yellow: " + sumYellow + " Sum of blue: " + sumBlue + " Sum of white: " + sumWhite +
    " Sum of black: " + sumBlack + " Sum of red: " + sumRed + " Sum of green: " + sumGreen);
  }
}
