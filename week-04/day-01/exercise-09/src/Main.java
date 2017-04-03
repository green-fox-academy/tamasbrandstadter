public class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Teacher teacher1 = new Teacher();

    System.out.println(student1.question(student1.studentQuestion));
    System.out.println(student1.question(teacher1.answer));
    System.out.println(teacher1.teach(teacher1.teacherOrder));
    System.out.println(teacher1.teach(student1.learn()));
    System.out.println("Knowledge" + student1.knowledge);
  }
}
