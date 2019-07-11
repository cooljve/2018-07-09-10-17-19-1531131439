package practice07;

public class Student extends Person {
  private Klass klass;

  public Klass getKlass() {
    return klass;
  }

  public Student(String name, int age, Klass klass) {
    super(name, age);
    this.klass = klass;
  }

  public String introduce(){
    Person person = new Person("Tom", 21);
    String str = person.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
    return str;
  }
}


