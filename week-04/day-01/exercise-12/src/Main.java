public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm();
    Animal animal = new Animal(30, 30);
    Animal animal2 = new Animal();
    farm.farmList.add(animal);
    farm.farmList.add(animal2);

    farm.breed();

    System.out.println("Free places: " + farm.getFreePlaces());
    System.out.println("Farm size is: " + farm.farmList.size());
    System.out.println("Animal1 hunger is: " + animal.hunger);
    System.out.println("Animal2 hunger is: " + animal2.hunger);

    farm.slaughter();

    for (int i = 0; i < farm.farmList.size(); i++) {
      System.out.println("Hunger after slaughter: " + farm.farmList.get(i).hunger);
    }
    System.out.println("New size after slaughter: " + farm.farmList.size());
  }
}
