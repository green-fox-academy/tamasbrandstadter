public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this(50, 50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int eat() {
    return hunger--;
  }

  public int drink() {
    return thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
}