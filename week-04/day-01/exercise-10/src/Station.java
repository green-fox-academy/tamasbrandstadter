public class Station {
  public int gasAmount = 120;

  public void refill(Car car) {
    if (gasAmount < car.capacity) {
      car.gasAmount = this.gasAmount;
      this.gasAmount = 0;
      System.out.println("Not enough gas for full tank.");
    } else {
      car.gasAmount = car.capacity;
      this.gasAmount = gasAmount - car.capacity;
      System.out.println("The tank is full.");
    }
  }
}
