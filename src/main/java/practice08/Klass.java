package practice08;

public class Klass {
    int number;
    Student leader;
    Klass(int number){
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void appendMember(Student student){
        student.setKlass(this);;
    }
    public void assignLeader(Student student){
        if(student.getKlass().getNumber()==this.getNumber())
            this.setLeader(student);
    }
    public int getNumber() {
        return number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }
}
