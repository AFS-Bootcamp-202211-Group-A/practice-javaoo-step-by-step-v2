package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private List<Person> members;

    public Klass(int number){
        this.number = number;
        this.members = new ArrayList<>();
    }

    public int getNumber(){
        return number;
    }

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

    public void assignLeader(Student student){
        if(!this.equals(student.getKlass())){
            System.out.println("It is not one of us.");
        } else {
            leader = student;
            members.forEach(member -> {
                if(member instanceof Student){
                    System.out.println(((Student) member).sayKlassLeader(this));
                } else if (member instanceof Teacher) {
                    System.out.println(((Teacher) member).sayKlassLeader(this));
                }
            });
        }
    }

    public boolean isLeader(Student student){
        return student.equals(leader);
    }

    public void attach(Person member) {
        members.add(member);
    }

    public Student getLeader(){
        return leader;
    }
}
