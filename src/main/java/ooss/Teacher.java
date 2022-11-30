package ooss;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Integer> klass = new ArrayList<>();
    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }
    public String introduce(){
        String msg= "My name is "+super.name+". I am "+super.age+" years old. "
                + "I am a teacher.";
        if(!klass.isEmpty()){
            msg += " I teach Class ";
            for (Integer number : klass) {
                msg += number+", ";
            }
            return msg.substring(0,msg.length()-2)+".";
        }
        return msg;
    }

    public boolean belongsTo(Klass klass) {
        return this.klass.contains(klass.getNumber());
    }

    public void assignTo(Klass klass) {
        this.klass.add(klass.getNumber());
    }

    public boolean isTeaching(Student tom) {
        return this.klass.contains(tom.getKlass());
    }
}
