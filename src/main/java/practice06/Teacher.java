package practice06;

public class Teacher extends Person {
  private int klass;

  public int getKlass() {
    return klass;
  }

  public Teacher(String name, int age, int klass) {
    super(name, age);
    this.klass = klass;
  }

  public Teacher(String name, int age) {
    super(name, age);
  }

  public String introduce(){
    Person person = new Person("Tom", 21);

    String str = person.introduce()+" I am a Teacher. I teach ";
    str = klass == 0 ? (str + "No Class.") : (str + "Class " + klass+".");
    return str;
  }
}
