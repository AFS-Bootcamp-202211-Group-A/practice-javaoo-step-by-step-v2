package ooss;

public class Klass {
    private int number;
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
        }
        else {
            System.out.println("It is not one of us.");
        }
    }
}
