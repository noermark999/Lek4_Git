package Person;

import java.time.LocalDate;

public class person {
    private String name;
    private int alder;
    private LocalDate fødseslsdag;

    public person(String name, int alder, LocalDate fødseslsdag) {
        this.name = name;
        this.alder = alder;
        this.fødseslsdag = fødseslsdag;
    }

    @Override
    public String toString() {
        return name + " " + alder + " år" + "Fødseslsdag: " + fødseslsdag;
    }
}
