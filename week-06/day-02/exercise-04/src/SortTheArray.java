import java.util.Arrays;

public class SortTheArray {
  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5, 6};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    sortTheArray(intArray);
    sortTheArray(doubleArray);
  }

  public static <T extends Number> void sortTheArray(T[] inputArray) {
    double[] array = new double[inputArray.length];
    Arrays.sort(inputArray);

    for (int i = 0; i < inputArray.length; i++) {
      array[i] = inputArray[(inputArray.length - 1 - i)].doubleValue();
      System.out.println(array[i]);
    }
  }
}
