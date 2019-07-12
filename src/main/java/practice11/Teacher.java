package practice11;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
  private List<Klass> classes = new LinkedList<>();

  public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
    super(id, name, age);
    this.classes = classes;
    for (Klass klass : this.classes) {
      klass.getTeacherList().add(this);
    }
  }

  public Teacher(int id, String name, int age) {
    super(id, name, age);
  }

  public String introduce() {
    String str = super.introduce() + " I am a Teacher. I teach ";
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
    String str = super.introduce() + " I am a Teacher. I";
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
        System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n",this.getName(),student.getName(),student.getKlass().getNumber()));
        break;
      }
      case "newMember":{
        System.out.print(String.format("I am %s. I know %s has joined Class %d.\n",this.getName(),student.getName(),student.getKlass().getNumber()));
        break;
      }
    }
  }

  public List<Klass> getClasses() {
    return classes;
  }
}





