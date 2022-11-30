package ooss;

public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        String output = super.introduce() + " I am a student.";
        if (klass.isLeader(this)){
            output += " I am the leader of class " + klass.getNumber() + ".";
        } else{
            output += " I am in class " + klass.getNumber()+ ".";
        }
        return output;
    }

    public void join(Klass newKlass){
        this.klass = newKlass;
    }

    public boolean isIn(Klass klass){
        return this.klass == klass;
    }

}
