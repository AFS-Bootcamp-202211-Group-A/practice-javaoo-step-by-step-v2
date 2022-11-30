package ooss;

import java.text.MessageFormat;

public class Teacher extends Person{

    public Teacher(int id, String name, int age){
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return MessageFormat.format("{0} I am a teacher.", super.introduce());
    }
}
