public class Student {

  public Student() {
  }

  public void learn() {
    System.out.println("Student learn method was called.");
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }
}