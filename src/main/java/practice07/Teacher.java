package practice07;

public class Teacher extends  Person{
    Klass klass;
    int flag;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(klass!=null){
            return super.introduce() +" I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
        }else {
            return super.introduce() +" I am a Teacher. I teach No Class.";
        }

    }

    public String introduceWith(Student student){
        if(student.getKlass().equals(this.klass)){
            return super.introduce() +" I am a Teacher. I teach "+student.getName()+".";
        }else {
            return super.introduce() +" I am a Teacher. I don't teach "+student.getName()+".";
        }

    }


}