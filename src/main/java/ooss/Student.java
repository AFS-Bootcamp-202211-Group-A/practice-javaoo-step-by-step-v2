package ooss;

import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce(){
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a student. I am in class 1.", this.getName(), this.getAge(), this.klass.getNumber());
    }

    public boolean isIn(Klass klass){
        if(this.klass != null){
            return this.klass.equals(klass);
        }
        return false;
    }

    public void join(Klass klass){
        this.klass = klass;
    }
}
