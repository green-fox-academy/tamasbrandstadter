public class Student {
  public int knowledge = 0;
  public String studentQuestion = "What is the answer for this question?";

  public String learn() {
    knowledge++;
    return "I will learn this.";
  }

  public String question(String studentQuestion) {
    return studentQuestion;
  }
}
