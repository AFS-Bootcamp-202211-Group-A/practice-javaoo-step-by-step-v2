package ooss;

public class Person {

    private int id;
    private String name;
    private int age;

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        Person anotherPerson = (Person) obj;
        return anotherPerson.id == this.id;
    }



}
