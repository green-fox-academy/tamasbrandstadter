public class PrintArguments {
  public static void main(String[] args) {
    String[] texts = {"aaa", "bbb", "ccc"};
    printer(texts);
  }

  public static void printer (String... testArray) {
    for (String random : testArray){
      System.out.println(random);
    }
  }
}