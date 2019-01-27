package tehtava01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee käyttäjältä merkkijonoja
 * ja lisää niitä listalle. Syötteiden lukeminen päätetään kun käyttäjä syöttää
 * tyhjän merkkijonon (tai '-'). Ohjelma tulostaa tämän jälkeen listan
 * ensimmäisen arvon.
 * 
 * Muokkaa ohjelmaa siten, että ensimmäisen arvon sijaan tulostetaan kolmas
 * arvo. Huomaa, että ohjelmoijat aloittavat laskemisen nollasta! Ohjelma saa
 * rikkoutua mikäli listalla ei ole vähintään kolmea arvoa, eli tällaiseen
 * tilanteeseen ei tarvitse varautua millään tavalla.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class KolmannenArvonTulostaminen {

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
        String eka = lista.get(0);
        System.out.println(eka);
    }
}
