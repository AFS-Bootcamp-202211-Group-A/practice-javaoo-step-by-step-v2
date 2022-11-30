package ooss;

import java.text.MessageFormat;

public class Teacher extends Person{
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce(){
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a teacher.", this.getName(), this.getAge());
    }
}
