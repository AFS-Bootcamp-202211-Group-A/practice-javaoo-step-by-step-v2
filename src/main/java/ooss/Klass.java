package ooss;

import java.util.List;

public class Klass {
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
    }

    public int getNumber() {
        return number;
    }
}
