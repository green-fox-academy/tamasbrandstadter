public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant plant = new Plant();
    Flower flower = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree = new Tree("purple");
    Tree tree2 = new Tree("orange");

    garden.add(plant);
    garden.add(flower);
    garden.add(flower2);
    garden.add(tree);
    garden.add(tree2);


  }
}
