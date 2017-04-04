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

    Mentor mentor = new Mentor();
    mentor.introduce();
    Mentor mentor2 = new Mentor("Frank", 20, "male", "junior");
    mentor2.introduce();
    mentor2.getGoal();
  }
}
