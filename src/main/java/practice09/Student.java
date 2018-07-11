package practice09;

public class Student extends Person{
    private Klass klass;


    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student() {
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String str = (klass.getLeader() != null && klass.getLeader().equals(this)) ? "Leader of " : "at ";
        return super.introduce() + " I am a Student. I am " + str + klass.getDisplayName() + ".";
    }
}
