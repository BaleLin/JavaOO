package practice06;

public class Teacher extends Person {

    private Integer klass;

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher() {
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String str = (klass != null) ? "Class " + klass + "." : "No Class.";
        return super.introduce() + " I am a Teacher. I teach " + str;
    }


}
