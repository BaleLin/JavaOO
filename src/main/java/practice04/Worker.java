package practice04;

public class Worker extends Person {

    public Worker(String name, Integer age) {
        super(name, age);
    }

    public Worker() {
    }

    @Override
    public String introduce() {
        return basicIntroduce() + " I am a Worker. I have a job.";
    }
}
