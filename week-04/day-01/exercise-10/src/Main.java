public class Main {
  public static void main(String[] args) {
    Station station = new Station();
    Car car1 = new Car(0, 100);
    station.refill(car1);
    System.out.println(car1.gasAmount + " " + station.gasAmount);
  }
}
