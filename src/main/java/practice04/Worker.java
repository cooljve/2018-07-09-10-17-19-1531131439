package practice04;

public class Worker extends Person {

  public Worker(String name, int age) {
    super(name, age);
  }

  public String introduce() {
    Person person = new Person("Tom", 21);
    String str = person.introduce()+" I am a Worker. I have a job.";
    return str;
  }
}
