package practice11;

public class Student extends Person {
  private Klass klass;

  public Klass getKlass() {
    return klass;
  }

  public Student(int id, String name, int age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public String introduce() {
    String str = super.introduce() + " I am a Student. I am ";
    if (klass.getLeader() != null && klass.getLeader().getName() == this.getName()) {
      str += "Leader of ";
    } else {
      str += "at ";
    }
    str += klass.getDisplayName() + ".";
    return str;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }
}
