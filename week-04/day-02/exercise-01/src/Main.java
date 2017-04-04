public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.introduce();
    person.getGoal();

    Student student = new Student();
    Student student2 = new Student("Tom", 28, "male", "Tesla");
    student.skipDays(5);
    student.introduce();
    student2.introduce();
  }
}
