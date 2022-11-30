package ooss;

import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    @Override
    public String introduce(){
        if (this.klass != null){
            String leaderStr = this.klass.isLeader(this) ?
                    MessageFormat.format("I am the leader of class {0}.", this.klass.getNumber())
                    : MessageFormat.format("I am in class {0}.", this.klass.getNumber());

            return MessageFormat.format("My name is {0}. I am {1} years old. I am a student. {2}", this.getName(), this.getAge(), leaderStr);
        };
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a student.", this.getName(), this.getAge());
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

    public Klass getKlass(){
        return this.klass;
    }
}
