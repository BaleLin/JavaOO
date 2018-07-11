package practice11;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person implements Observer {
    private LinkedList<Klass> classes;

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(x -> {
            x.addObserver(this);
        });
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher() {
    }

    public LinkedList<Klass> getKlass() {
        return classes;
    }

    public void setKlass(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String str;
        if (classes != null && classes.size() > 0) {
            StringBuilder sb = new StringBuilder("Class ");
            classes.forEach(x -> {
                sb.append(x.getNumber()).append(", ");
            });
            str = sb.toString().substring(0, sb.toString().lastIndexOf(",")) + ".";
        } else {
            str = "No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach " + str;
    }


    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        for (Klass aClass : classes) {
            if (aClass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        String str = isTeaching(student) ? "I teach " + student.getName() : "I don't teach " + student.getName();
        return super.introduce() + " I am a Teacher. " + str + ".";
    }


    @Override
    public void update(Observable o, Object arg0) {
        String msg = (String) arg0;
        System.out.print("I am " + getName() + ". " + msg + "\n");
    }
}
