package practice07;

public class Student extends Person{
  private Klass klass;
  public Student() {
  }

  public Student(String name, Integer age, Klass klass) {
    super(name, age);
    this.klass = klass;
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
  }

  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }
}
