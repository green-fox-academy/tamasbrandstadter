public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant plant = new Plant();
    Plant flower = new Flower("yellow");
    Plant flower2 = new Flower("blue");

    garden.add(plant);
    garden.add(flower);
    garden.add(flower2);

    garden.watering();







    //Tree tree = new Tree("purple");
    //Tree tree2 = new Tree("orange");
    //garden.add(tree);
    //garden.add(tree2);




  }
}
