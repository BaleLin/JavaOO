package practice06;

public class Teacher extends  Person{
    int klass;
    int flag;
    public Teacher(String name, int age) {
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name, int age,int klass) {
        super(name,age);
        this.klass = klass;
        flag=1;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
    public String introduce(){
        if(flag==1){
            return super.introduce() +" I am a Teacher. I teach Class "+this.getKlass()+".";
        }else {
            return super.introduce() +" I am a Teacher. I teach No Class.";
        }

    }


}
