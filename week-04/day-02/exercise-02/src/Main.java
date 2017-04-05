public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant plant = new Plant();
    Plant flower = new Flower("yellow", 3, 10);
    Plant flower2 = new Flower("blue", 4, 15);
    Plant tree = new Tree("purple", 10, 20);
    Plant tree2 = new Tree("orange", 1, 20);

    garden.add(plant);
    garden.add(flower);
    garden.add(flower2);
    garden.add(tree);
    garden.add(tree2);

    garden.countThirstyPlant();

    if (flower.needsWater()) {
      System.out.println("The yellow Flower needs water.");
    }
    if (flower2.needsWater()) {
      System.out.println("The blue Flower needs water.");
    }
    if (tree.needsWater()) {
      System.out.println("The purple Tree needs water.");
    }
    if (tree2.needsWater()) {
      System.out.println("The orange Tree needs water.");
    }

    garden.watering(40);
    if (flower.getCurrentWater() > flower.getMaxWater()) {
      System.out.println("The yellow Flower doesn't need water.");
    } else {
      System.out.println("The yellow Flower needs water.");
    }
    if (flower2.getCurrentWater() > flower2.getMaxWater()) {
      System.out.println("The blue Flower doesn't need water.");
    } else {
      System.out.println("The blue Flower needs water.");
    }
    if (tree.getCurrentWater() > tree.getMaxWater()) {
      System.out.println("The purple Tree doesn't need water.");
    } else {
      System.out.println("The purple Tree needs water.");
    }
    if (tree2.getCurrentWater() > tree2.getMaxWater()) {
      System.out.println("The orange Tree doesn't need  water.");
    } else {
      System.out.println("The orange Tree needs water.");
    }








  }
}
