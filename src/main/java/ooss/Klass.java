package ooss;

public class Klass {
    private int number;

    public int getNumber() {
        return number;
    }

    public Klass(int number){
        this.number = number;
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
