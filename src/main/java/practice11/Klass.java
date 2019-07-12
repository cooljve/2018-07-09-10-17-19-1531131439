package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
  private int number;
  private Student leader;
  private List<Teacher> teacherList = new ArrayList<>();
  private List<Student> studentList = new ArrayList<>();

  public Klass(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public String getDisplayName() {
    return "Class " + number;
  }

  public void assignLeader(Student leader) {
    if (!studentList.contains(leader)) {
      System.out.print("It is not one of us.\n");
    } else {
      this.leader = leader;
      for (Teacher teacher : this.teacherList) {
        if (teacher.getClasses().contains(this)) {
          teacher.printInform("newLeader",leader);
        }
      }
    }
  }

  public void appendMember(Student student) {
    student.setKlass(this);
    studentList.add(student);
    for (Teacher teacher : teacherList) {
      if (teacher.getClasses().contains(this)) {
        teacher.printInform("newMember",student);
      }
    }
  }

  public Student getLeader() {
    return leader;
  }

  public List<Teacher> getTeacherList() {
    return teacherList;
  }

  public boolean isIn(Student student) {
    return number == student.getKlass().number;
  }
}




