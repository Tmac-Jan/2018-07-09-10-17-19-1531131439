package practice06;

public class Teacher extends Person{
  private Integer klass;
  public Teacher() {
  }

  public Teacher(String name, Integer age, Integer klass) {
    super(name, age);
    this.klass = klass;
  }
  public Teacher(String name, Integer age) {
    super(name, age);
  }
  public Teacher(Integer klass) {
    this.klass = klass;
  }

  @Override
  public String introduce() {
    return super.introduce()+"I am a Teacher. "+
        klass==null?"I teach Class "+klass+".":"I teach No Class."
        ;
  }

  public Integer getKlass() {
    return klass;
  }

  public void setKlass(Integer klass) {
    this.klass = klass;
  }

}