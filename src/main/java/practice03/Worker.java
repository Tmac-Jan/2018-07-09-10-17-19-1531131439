package practice03;

public class Worker extends Person {

  public Worker() {
  }

  public Worker(String name, Integer age) {
    super(name, age);
  }

  @Override
  public String introduce() {
    return "I am a Worker. I have a job.";
  }
}
