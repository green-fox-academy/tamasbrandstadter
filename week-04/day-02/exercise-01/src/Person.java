public class Person {
  private String name;
  private int age;
  private String gender;

  public void introduce() {
    System.out.println("Hi, I'm " + name + " and " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Person(String name, int age, String gender) {

  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

}
