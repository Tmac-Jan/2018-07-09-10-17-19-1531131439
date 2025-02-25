package practice05;

public class Student extends Person{
  private Integer klass;
  public Student() {
  }

  public Student(String name, Integer age, Integer klass) {
    super(name, age);
    this.klass = klass;
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Student. I am at Class "+klass+".";
  }

  public Integer getKlass() {
    return klass;
  }

  public void setKlass(Integer klass) {
    this.klass = klass;
  }

}

