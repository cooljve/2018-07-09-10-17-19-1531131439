package practice09;

public class Teacher extends Person {
  private Klass klass;
  Person person = new Person(1,"Tom", 21);

  public Klass getKlass() {
    return klass;
  }

  public Teacher(int id, String name, int age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public Teacher(int id, String name, int age) {
    super(id, name, age);
  }

  public String introduce() {
    String str = person.introduce() + " I am a Teacher. I teach ";
    str = klass == null ? (str + "No Class.") : (str + "Class " + klass.getNumber() + ".");
    return str;
  }

  public String introduceWith(Student student) {
    String str = person.introduce() + " I am a Teacher. I";
    str+=student.getKlass().getNumber() == klass.getNumber()?" teach ":" don't teach ";
    str += student.getName() + ".";
    return str;
  }
}



