public class TodoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    todoText = "My todo:\n" + todoText + " - Download games\n";
    todoText = todoText + "   - Buy diablo";


    System.out.println(todoText);
  }
}
