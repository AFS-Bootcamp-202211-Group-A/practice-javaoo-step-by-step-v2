package ooss;

import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age){
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String introduction = MessageFormat.format("{0} I am a student.", super.introduce());
        if (klass != null) {
            introduction = MessageFormat.format("{0} I am in class {1}.", introduction, klass.getNumber());
        }
        return introduction;
    }

    public void join(Klass klass){
        this.klass = klass;
    }

    public boolean isIn(Klass klass){
        if(this.klass == null) return false;
        return this.klass.equals(klass);
    }

    public Klass getKlass() {
        return klass;
    }
}
