package tehtava14; // Poista tämä rivi Viopessa!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä. Lisää ohjelmaan
 * toiminnallisuus, missä syötteiden lukemisen jälkeen kysytään vielä yhtä
 * merkkijonoa. Ohjelma kertoo tämän jälkeen löytyikö käyttäjän syöttämä
 * merkkijono listalta vai ei.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();

        System.out.println("Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa:");

        while (true) {
            String syote = lukija.nextLine();

            if ("".equals(syote) || "-".equals(syote)) {
                break;
            } else {
                lista.add(syote);
            }
        }

        System.out.println(); // Tyhjä rivi tulosteeseen

        System.out.print("Ketä etsitään? ");
        String etsittava = lukija.nextLine();

        lukija.close();

        // TODO: Muokkaa alla olevaa koodia tehtävänannon mukaisesti.

        // Tulosta:
        System.out.println(etsittava + " löytyi!");

        // Tai:
        System.out.println(etsittava + " ei löytynyt!");
    }
}
