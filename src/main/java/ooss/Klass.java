package ooss;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student studentLeader;

    private ArrayList<Student> klassStudents = new ArrayList<>();
    private ArrayList<Teacher> klassTeachers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public Klass(int number){
        this.number = number;
    }

    public void attach(Teacher teacher){
        klassTeachers.add(teacher);
    }

    public void attach(Student student){
        klassStudents.add(student);
    }

    public void assignLeader(Student student){

        if (!student.isIn(this)){
            System.out.println("It is not one of us.");
        }else{
            this.studentLeader = student;
        }

        // for teachers
        klassTeachers.forEach(teacher ->
                System.out.println(teacher.myNameAndClass() + " I know " + student.getName() + " become Leader."));
        klassStudents.forEach(studentInClass ->
                System.out.println(studentInClass.myNameAndClass() + " I know " + student.getName() + " become Leader."));
    }

    public boolean isLeader(Student student){
        return this.studentLeader == student;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Klass)) return false;

        Klass anotherKlass = (Klass) obj;
        return anotherKlass.number == this.number;
    }

}
