package ooss;

public class Klass {
    private int number;
    private Student studentLeader;

    public int getNumber() {
        return number;
    }

    public Klass(int number){
        this.number = number;
    }

    public void assignLeader(Student student){

        if (!student.isIn(this)){
            System.out.println("It is not one of us.");
        }else{
            this.studentLeader = student;
        }
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
