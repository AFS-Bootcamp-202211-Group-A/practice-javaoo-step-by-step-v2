package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private List<Klass> klasses;
    public Teacher(int id, String name, int age){
        super(id, name, age);
        klasses = new ArrayList<>();
    }

    @Override
    public String introduce() {
        String introduction = MessageFormat.format("{0} I am a teacher.", super.introduce());
        if(klasses.size() > 0) {
            String taught = klasses
                    .stream()
                    .map(klass -> Integer.toString(klass.getNumber()))
                    .collect(Collectors.joining(", "));
            introduction = MessageFormat.format("{0} I teach Class {1}.", introduction, taught);
        }
        return introduction;
    }

    public void assignTo(Klass klass){
        klasses.add(klass);
    }

    public boolean belongsTo(Klass klass){
        return klasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return klasses.contains(student.getKlass());
    }
}
