public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant plant = new Plant(0);
    Plant flower = new Flower("yellow", 3);
    Plant flower2 = new Flower("blue", 4);
    Plant tree = new Tree("purple", 9);
    Plant tree2 = new Tree("orange", 1);

    garden.add(plant);
    garden.add(flower);
    garden.add(flower2);
    garden.add(tree);
    garden.add(tree2);



  }
}
