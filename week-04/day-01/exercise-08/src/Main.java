public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter(0);
    System.out.println(counter.addNumber(50));
    counter.add();
    System.out.println(counter.counter);
    System.out.println(counter.getValue());
    counter.add();
    System.out.println(counter.counter);
    System.out.println(counter.reset());
  }
}
