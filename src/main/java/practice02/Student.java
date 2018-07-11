package practice02;

public class Student extends Person{

    private String name;
    private Integer age;
    private Integer klass;

    public Student(String name, Integer age, Integer klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", klass=" + klass +
                '}';
    }

    public String introduce() {
        return "I am a Student. I am at Class " + klass + ".";
    }
}
