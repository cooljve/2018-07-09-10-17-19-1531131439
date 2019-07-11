package practice10;

public class Student extends Person {
  private Klass klass;
  private Student leader;

  public Klass getKlass() {
    return klass;
  }

  public Student(int id, String name, int age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public String introduce() {
    Person person = new Person(getId(), getName(), getAge());
    String str = person.introduce() + " I am a Student. I am ";
    if (klass.getLeader() != null && klass.getLeader().getName() == person.getName()) {
      str += "Leader of ";
    } else {
      str += "at ";
    }
    str += klass.getDisplayName() + ".";
    return str;
  }
}





