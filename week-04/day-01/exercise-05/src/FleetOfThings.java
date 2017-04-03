public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing thing1 = new Thing("Get milk");
    Thing thing2 = new Thing("Remove the obstacles");
    Thing thing3 = new Thing("Stand up");
    Thing thing4 = new Thing("Eat lunch");

    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);
    thing3.complete();
    fleet.add(thing4);
    thing4.complete();

    System.out.println(fleet);
  }
}