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
            if(klass.isLeader(this)) {
                introduction = MessageFormat.format(
                        "{0} I am the leader of class {1}.", introduction, klass.getNumber()
                );
            } else {
                introduction = MessageFormat.format("{0} I am in class {1}.", introduction, klass.getNumber());
            }
        }
        return introduction;
    }

    public void join(Klass klass){
        this.klass = klass;
        klass.attach(this);
    }

    public boolean isIn(Klass klass){
        if(klass == null) return false;
        return klass.equals(this.klass);
    }

    public Klass getKlass() {
        return klass;
    }

    public String sayKlassLeader(Klass klass){
        return MessageFormat.format("" +
                        "I am {0}, student of Class {1}. I know {2} become Leader.",
                getName(), klass.getNumber(), klass.getLeader().getName()
        );
    }


}
