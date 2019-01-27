package tehtava04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä. Muokkaa
 * ohjelman toimintaa siten, että kun syötteiden lukeminen lopetetaan, ohjelma
 * tulostaa listalla olevien arvojen lukumäärän.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ListanKoko {

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
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        // TODO: Muokkaa alla olevaa koodia tehtävänannon mukaisesti
        System.out.println("Yhteensä: " + 0);
    }
}
