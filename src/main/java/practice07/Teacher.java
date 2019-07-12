package practice07;

public class Teacher extends Person {
  private Klass klass;
  public Teacher() {
  }

  public Teacher(String name, Integer age, Klass klass) {
    super(name, age);
    this.klass = klass;
  }

  public Teacher(String name, Integer age) {
    super(name, age);
  }

  @Override
  public String introduce() {
    return super.introduce()+" I am a Teacher."+
        (klass==null?" I teach No Class.":" I teach Class "+klass.getNumber()+".");
  }
  public String introduceWith(Student student){

    return super.introduce()+" I am a Teacher."+
        (klass.getNumber()==student.getKlass().getNumber()?" I teach "
        +student.getName()+".":" I don't teach "+student.getName()+".");
  }
  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }
}
