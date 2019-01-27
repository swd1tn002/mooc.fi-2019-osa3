package tehtava06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä ja lisää
 * syötteet listalle. Syötteen lukeminen lopetetaan kun käyttäjä syöttää tyhjän
 * merkkijonon.
 * 
 * Muokkaa ohjelmaa siten, että kun syötteiden lukeminen lopetetaan, ohjelma
 * tulostaa sekä ensiksi että viimeksi luetun arvon. Voit olettaa, että listalle
 * luetaan vähintään kaksi arvoa.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class EnsimmainenJaViimeinenArvo {

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

        // TODO: Täydennä koodia tehtävänannon mukaisesti
    }
}
