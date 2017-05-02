public class SumTheArray {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4, 5, 6};
        System.out.println(sumTheArray(inputArray, 6));
    }

    public static <T extends Number> int sumTheArray(T[] inputArray, int lenght) {
        int[] array = new int[inputArray.length];
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = inputArray[(inputArray.length - 1 - i)].intValue();
        }
        try {
            for (int i = 0; i < lenght; i++) {
                sum += array[i];
            }
            return sum;
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Array index out of bounds.");
            return 0;
        }
    }
}
