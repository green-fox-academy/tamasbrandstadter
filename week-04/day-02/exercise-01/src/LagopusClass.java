import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  private String className;
  private List<String> students;
  private List<String> mentors;

  public void addStudent (String student) {
    students.add(student);
  }

  public void addMentor (String mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + "class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }
}
