package practice11;

import java.util.Objects;
import java.util.Observable;

public class Klass extends Observable {
    private Integer number;
    private Student leader;
    private String message;

    public String getMessage() {
        return message;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public Klass() {
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(number, klass.number) &&
                Objects.equals(leader, klass.leader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, leader);
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        this.setChanged();
        this.notifyObservers("I know " + student.getName() + " has joined " + student.getDisPlayClassName() + ".");
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            leader = student;
            setChanged();
            notifyObservers("I know " + student.getName() + " become Leader of " + student.getDisPlayClassName() + ".");
        } else {
            System.out.print("It is not one of us.\n");
        }

    }

    public boolean isIn(Student student) {
        return this.equals(student.getKlass());
    }

}
