public class Main {
  public static void main(String[] args) {
    String[][] colors = new String [3][3];
    String[] greenColors = {"lime", "forest green", "pale green"};
    String[] redColors = {"orange red", "red", "tomato"};
    String[] pinkColors = {"orchid", "violet", "hot pink"};

    colors[0][0] = greenColors[0];
    colors[0][1] = greenColors[1];
    colors[0][2] = greenColors[2];

    colors[1][0] = redColors[0];
    colors[1][1] = redColors[1];
    colors[1][2] = redColors[2];

    colors[2][0] = pinkColors[0];
    colors[2][1] = pinkColors[1];
    colors[2][2] = pinkColors[2];

    for (int i = 0; i < colors.length ; i++) {
      for (int j = 0; j < colors[i].length; j++) {
        System.out.println(colors[i][j]);
      }
      System.out.println();
    }
  }
}