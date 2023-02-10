package Test;

public class Person {

    private String name;
    private int alder;

    public Person(String name, int alder) {
        this.name = name;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return name + " " + alder + " år" ;
    }
}
