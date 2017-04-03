public class Counter {
  public int counter = 0;

  public Counter(int counter) {
    this.counter = counter;
  }

  public int addNumber(int number) {
    this.counter = counter + number;
    return this.counter;
  }

  public void add() {
    this.counter++;
  }

  public int getValue(){
    int value = this.counter;
    return value;
  }

  public int reset(){
    return this.counter = 0;
  }
}
