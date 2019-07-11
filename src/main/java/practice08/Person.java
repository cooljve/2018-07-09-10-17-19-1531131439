package practice08;

import java.util.Objects;

public class Person {
  private int id;
  private String name;
  private int age;

  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    Person person = (Person) o;
    return id == person.id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String introduce() {
    String str = "My name is " + name + ". I am " + age + " years old.";
    return str;
  }
}



