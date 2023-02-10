package Person;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        person Jakob = new person("Jakob", 21, LocalDate.of(2001, 3, 24));
        person Kien = new person("Kien",24,LocalDate.of(1998,6,12));
        person Jeppe = new person("Jeppe",24,LocalDate.of(1998,04,05));
        person Oliver = new person("Oliver",20,LocalDate.of(2002,02,26));
        System.out.println(Jakob);
        System.out.println(Kien);
        System.out.println(Jeppe);
        System.out.println(Oliver);



    }
}
