package practice05;

public class Person {

  private String name;
  private Integer age;

  public Person() {
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
  public String introduce(){
    return "My name is "+name+". I am "+age+" years old. ";
  }
  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
}

