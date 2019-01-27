package tehtava11; // Poista tämä rivi Viopessa!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Toteuta ohjelma, joka lukee käyttäjältä lukuja. Kun käyttäjä syöttää luvun
 * 9999, lukujen lukeminen lopetetaan. Ohjelma tulostaa tämän jälkeen pienimmän
 * listalla olevan luvun sekä indeksit, joista pienin luku löytyy. Pienin luku
 * voi siis esiintyä useamman kerran.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (9999 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == 9999) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        // TODO: Täydennä koodia tehtävänannon mukaisesti
    }
}
