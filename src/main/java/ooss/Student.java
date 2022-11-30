package ooss;

public class Student extends Person {
    public Student(int id, String name, int age) {
        super(id,name,age);
    }
    public String introduce(){
        return "My name is "+super.name+". I am "+super.age+" years old. "
                + "I am a student.";
    }
}
