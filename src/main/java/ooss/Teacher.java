package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    List<Klass> klasses;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klasses = new ArrayList<>();
    }

    @Override
    public String introduce(){
        if (klasses.isEmpty()){
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a teacher.", this.getName(), this.getAge());
        }
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a teacher. I teach Class {2}.", this.getName(), this.getAge(), this.getKlasses());
    }

    public void assignTo(Klass klass){
        this.klasses.add(klass);
    }

    public boolean belongsTo(Klass klass){
        if (klasses != null){
            return this.klasses.contains(klass);
        }
        return false;
    }

    public boolean isTeaching(Student student){
        if (klasses != null){
            return this.klasses.contains(student.getKlass());
        }
        return false;
    }

    public String getKlasses(){
        return this.klasses.stream().map(klass -> String.valueOf(klass.getNumber())).collect(Collectors.joining(", "));
    }
}
