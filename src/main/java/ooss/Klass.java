package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Student student;

    private List<Person> people;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    private final int number;



    public Klass(int number) {
        this.number = number;
        this.student = null;
        this.people = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student){
        Klass studentKlass = student.getKlass();
        if (studentKlass != null){
            if( studentKlass.getNumber() == this.getNumber()){
                this.student = student;
                people.stream().forEach(person -> {
                    System.out.println(constructMsg(person, student));
                });
            }
        }
        else{
            System.out.println("It is not one of us.");
        }

    }

    private String constructMsg(Person person, Student student) {
        if (person instanceof Student) {
            return MessageFormat.format("I am {0}, student of Class {1}. I know {2} become Leader.", person.getName(), ((Student) person).getKlass().getNumber(), student.getName());
        } else if (person instanceof Teacher) {
            if (((Teacher) person).getKlasses().contains(String.valueOf(student.getKlass().getNumber()))){
                return MessageFormat.format("I am {0}, teacher of Class {1}. I know {2} become Leader.", person.getName(), student.getKlass().getNumber(), student.getName());
            }
            return "";
        }
        return "";
    }

    public boolean isLeader(Student student){
        if(this.student != null){
            return this.student == student;
        }
        return false;
    }

//    public void attach(Person person){
//        people.add(person);
//
//    }



}
