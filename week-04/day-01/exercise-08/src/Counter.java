public class Counter {
  private int count;
  private int initialValue;

  public Counter(int count) {
    this.count = count;
    this.initialValue = count;
  }

  public Counter() {
    this.count = 0;
    this.initialValue = 0;
  }

  public void add(int number) {
    this.count += number;
  }

  public void add() {
    this.count++;
  }

  public int get() {
    return count;
  }

  public void reset() {
    this.count = initialValue;
  }
}