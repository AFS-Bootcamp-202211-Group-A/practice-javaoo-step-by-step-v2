package ooss;

public class Student extends Person {
    private int klass;
    public Student(int id, String name, int age) {
        super(id,name,age);
    }
    public String introduce(){
        String msg = "My name is "+super.name+". I am "+super.age+" years old. "
                + "I am a student.";
        if(klass != 0){
            msg += " I am in class "+klass+".";
        }
        return msg;
    }

    public boolean isIn(Klass klass) {
        return this.klass == klass.getNumber();
    }

    public void join(Klass klass) {
        this.klass = klass.getNumber();
    }
}
