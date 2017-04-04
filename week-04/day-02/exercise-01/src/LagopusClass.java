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

  LagopusClass(String className) {
    students.removeAll(students);
    mentors.removeAll(mentors);
  }
}
