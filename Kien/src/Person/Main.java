package Person;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        person Jakob = new person("Jakob", 21, LocalDate.of(2001, 3, 24));
        person Kien = new person("Kien",24,LocalDate.of(1998,6,12));
        System.out.println(Jakob);


    }
}
