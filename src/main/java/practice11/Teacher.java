package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
  private LinkedList<Klass> classes = new LinkedList<>();
  Person person = new Person(getId(), getName(), getAge());

  public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
    super(id, name, age);
    this.classes = classes;

  }

  public Teacher(int id, String name, int age) {
    super(id, name, age);
  }

  public LinkedList<Klass> getClasses() {
    return classes;
  }

  public String introduce() {
    String str = person.introduce() + " I am a Teacher. I teach ";
    if (classes.size() == 0) {
      str += "No Class.";
    } else {
      str += "Class ";
      for (Klass klass : classes) {
        str += klass.getNumber() + ", ";
      }
      str = str.substring(0, str.length() - 2);
      str += ".";
    }
    return str;
  }

  public String introduceWith(Student student) {
    String str = person.introduce() + " I am a Teacher. I";
    str += isTeaching(student) ? " teach " : " don't teach ";
    str += student.getName() + ".";
    return str;
  }

  public boolean isTeaching(Student student) {
    for (Klass klass : classes) {
      if (klass.isIn(student)) {
        return true;
      }
    }
    return false;
  }

  public void printInform(String type,Student student){
    switch (type) {
      case "newLeader":{
        System.out.print("I am "+person.getName()+". I know "
            +student.getName()+" become Leader of Class "+student.getKlass().getNumber());
        break;
      }
      case "newMember":{
        System.out.print("I am "+person.getName()+". I know "
            +student.getName()+" has joined Class "+student.getKlass().getNumber());
        break;
      }
    }
    System.out.println("123");
  }

}





