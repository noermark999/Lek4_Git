import java.util.ArrayList;
import java.util.Scanner;

public class Geogeussr {
    private ArrayList<String> lande;

    public Geogeussr() {
        lande = new ArrayList<>();
        init();
    }

    private void init() {
        lande.add("1. Danmark");
        lande.add("2. USA");
        lande.add("3. Irland");
        lande.add("4. Australien");
        lande.add("5. Chile");
        lande.add("6. Kyrgyzstan");
        lande.add("Vietnam");
    }

    public void start() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(lande);
            System.out.println("Skriv tallet på et land:");
            String guess = scan.nextLine();
            System.out.println("Du valgte: " + lande.get(Integer.parseInt(guess)-1));
            }
        }
}
