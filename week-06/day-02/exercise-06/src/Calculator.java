public class Calculator<T extends Number> {
  public static void main(String[] args) {
    System.out.println(add(5, 6));
    System.out.println(subtract(5, 6));
    System.out.println(multiply(5, 0));
    System.out.println(divide(5, 0));
  }

  public static <T extends Number> double add(T a, T b) {
    double sum = 0;
    sum = a.doubleValue() + b.doubleValue();
    return sum;
  }

  public static <T extends Number> double subtract(T a, T b) {
    double difference = 0;
    difference = a.doubleValue() - b.doubleValue();
    return difference;
  }

  public static <T extends Number> double multiply(T a, T b) {
    double product = 0;
    product = a.doubleValue() * b.doubleValue();
    return product;
  }

  public static <T extends Number> double divide(T a, T b) {
    double fraction = 0;
    fraction = a.doubleValue() / b.doubleValue();
    return fraction;
  }
}
