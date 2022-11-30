package ooss;

public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        return super.introduce() + " I am a student." + " I am in class " + klass.getNumber()+ ".";
    }

    public void join(Klass newKlass){
        this.klass = newKlass;
    }

    public boolean isIn(Klass klass){
        return this.klass == klass;
    }

}
