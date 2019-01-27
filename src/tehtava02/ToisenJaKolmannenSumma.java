package tehtava02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee käyttäjältä
 * kokonaistyyppisiä lukuja ja lisää niitä listalle. Lukeminen lopetetaan kun
 * käyttäjä syöttää luvun 0. Ohjelma tulostaa tämän jälkeen listan ensimmäisen
 * arvon.
 * 
 * Muokkaa ohjelmaa siten, että listan ensimmäisen arvon sijaan ohjelma tulostaa
 * listan toisen ja kolmannen arvon summan. Ohjelma saa rikkoutua mikäli
 * listalla ei ole vähintään kolmea arvoa, eli tällaiseen tilanteeseen ei
 * tarvitse varautua millään tavalla.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ToisenJaKolmannenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (0 lopettaa):");

        while (true) {
            // Syötetty merkkijono voidaan muuttaa kokonaisluvuksi
            // myös Integer.parseInt-metodilla
            int syote = Integer.parseInt(lukija.nextLine());

            if (syote == 0) {
                break;
            } else {
                luvut.add(syote);
            }
        }

        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        // TODO: Muokkaa alla olevaa koodia tehtävänannon mukaisesti
        int eka = luvut.get(0);
        System.out.println(eka);
    }
}
