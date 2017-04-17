public class Main {
  public static void main(String[] args) {
    F16 f16 = new F16();
    F35 f35 = new F35();
    f16.refill(200);
    f35.refill(20);
    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
    System.out.println("F16 damage done in fight: " + f16.fight());
    System.out.println("F35 damage done in fight: " + f35.fight());
    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());

    Carrier carrier = new Carrier(100);
    Carrier carrier2 = new Carrier(100);
    carrier.addAirCraft("F16");
    carrier.addAirCraft("F35");
    carrier.fill();
    System.out.println(carrier.getAircraftList().get(0).getStatus());
    System.out.println(carrier.getAircraftList().get(1).getStatus());
    carrier.fight(carrier2);
    System.out.println(carrier.getAircraftList().get(0).getStatus());
    System.out.println(carrier.getAircraftList().get(1).getStatus());
    System.out.println(carrier.getStatus());
  }
}
