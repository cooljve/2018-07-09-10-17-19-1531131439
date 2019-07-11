package practice06;

public class Student extends Person {
  private int klass;

  public int getKlass() {
    return klass;
  }

  public Student(String name, int age, int klass) {
    super(name, age);
    this.klass = klass;
  }

  public String introduce(){
    Person person = new Person("Tom", 21);
    String str = person.introduce()+" I am a Student. I am at Class "+klass+".";
    return str;
  }
}

