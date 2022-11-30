package ooss;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private List<String> members = new ArrayList<>();
    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
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

    public boolean isLeader(Student student) {
        return student.isLeader();
    }

    public void assignLeader(Student student) {
        if(student.getKlass() == this.number){
            student.setLeader(true);
            members.forEach(member -> {
                String memberName = member.split(",")[0];
                String identity = member.split(",")[1];
                System.out.println("I am " + memberName
                        + ", "+identity+" of Class " +number
                        +". I know "+student.getName()
                        + " become Leader.");
            });
        }
        else {
            System.out.println("It is not one of us.");
        }
    }

    public void attach(Person person) {
        String identity = person.introduce().contains("teacher")?"teacher":"student";
        members.add(person.name +","+identity);
    }
}
