public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant plant = new Plant();
    Plant flower = new Flower("yellow", 3, 20);
    Plant flower2 = new Flower("blue", 4, 20);
    Plant tree = new Tree("purple", 9, 30);
    Plant tree2 = new Tree("orange", 1, 30);

    garden.add(plant);
    garden.add(flower);
    garden.add(flower2);
    garden.add(tree);
    garden.add(tree2);

    garden.countThirstyPlant();

    if (flower.needsWater()) {
      System.out.println("The yellow Flower needs water.");
    } if (flower2.needsWater()) {
      System.out.println("The blue Flower needs water.");
    } if (tree.needsWater()) {
      System.out.println("The purple Tree needs water.");
    } if (tree2.needsWater()) {
      System.out.println("The orange Tree needs water.");
    }

    garden.watering(40);

    
    System.out.println("flower1 currentwater: " + flower.getCurrentWater());
    System.out.println("flower2 currentwater: " + flower2.getCurrentWater());
    System.out.println(tree.getCurrentWater());
    System.out.println(tree2.getCurrentWater());
  }
}
