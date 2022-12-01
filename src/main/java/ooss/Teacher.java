package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private ArrayList<Klass> responsibleClasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public void assignTo(Klass klass){
        responsibleClasses.add(klass);
    }

    public boolean belongsTo(Klass klass){
        return responsibleClasses.contains(klass);
    }

    public boolean isTeaching(Student student){
        return responsibleClasses.stream().anyMatch(student::isIn);
    }

    public String myNameAndClass(){
        List<String> responsibleClassesString = responsibleClasses.stream().map(Klass::getNumber).map(Object::toString).collect(Collectors.toList());
        String classes = String.join(", ", responsibleClassesString);
        return "I am " + this.getName() + ", teacher of Class " + classes + ".";
    }


    public String introduce() {

        List<String> responsibleClassesString = responsibleClasses.stream().map(Klass::getNumber).map(Object::toString).collect(Collectors.toList());
        String classes = String.join(", ", responsibleClassesString);

        if (responsibleClasses.size() > 0){
            return super.introduce() + " I am a teacher." + " I teach Class " + classes + ".";

        } else{
            return super.introduce() + " I am a teacher.";
        }

    }
}
