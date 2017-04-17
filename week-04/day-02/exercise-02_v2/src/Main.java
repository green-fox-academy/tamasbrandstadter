public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");

    garden.getPlantList().add(flower1);
    garden.getPlantList().add(flower2);
    garden.getPlantList().add(tree1);
    garden.getPlantList().add(tree2);

    garden.watering(40, garden.needsWater());
    garden.watering(70, garden.needsWater());
    garden.needsWater();
  }
}