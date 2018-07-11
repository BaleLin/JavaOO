package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher() {
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String str = (klass != null) ? klass.getDisplayName() + "." : "No Class.";
        return super.introduce() + " I am a Teacher. I teach " + str;
    }

    public String introduceWith(Student student) {
        String str = (student.getKlass().equals(klass)) ? "I teach " + student.getName() : "I don't teach " + student.getName();
        return super.introduce() + " I am a Teacher. " + str + ".";
    }
}
