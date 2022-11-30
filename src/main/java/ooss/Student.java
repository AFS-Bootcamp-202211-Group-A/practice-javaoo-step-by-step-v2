package ooss;

import java.text.MessageFormat;

public class Student extends Person{

    public Student(int id, String name, int age){
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return MessageFormat.format("{0} I am a student.",super.introduce());
    }
}
