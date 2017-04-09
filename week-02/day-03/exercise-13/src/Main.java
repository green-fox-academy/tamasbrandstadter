public class Main {

  public static void main(String[] args) {
    int[][] numbers = new int[4][4];
    numbers[0][0] = 1;
    numbers[1][1] = 1;
    numbers[2][2] = 1;
    numbers[3][3] = 1;

    for (int i = 0; i <numbers.length ; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        System.out.print(numbers[i][j]);
      }
      System.out.println();
    }
  }
}