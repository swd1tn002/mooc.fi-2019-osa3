package tehtava03;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista on erittäin hyödyllinen kun halutaan säilöä muuttujien arvoja myöhempää
 * käsittelyä varten. Sillä on myös helpohko tehdä virheitä.
 * 
 * Tehtäväpohjassa on listaa käyttävä ohjelma. Muokkaa ohjelmaa siten, että sen
 * suorittaminen tuottaa aina virheen IndexOutOfBoundsException. Ohjelman tulee
 * olla sellainen, että käyttäjän ei tarvitse antaa koneelle syötettä (esim.
 * näppäimistöltä).
 * 
 * Ohjelmassa näkyy myös tapa listan läpikäyntiin — palaamme tähän tapaan
 * myöhemmin.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        List<String> sanalista = new ArrayList<>();

        sanalista.add("Ensimmäinen");
        sanalista.add("Toinen");

        int kokonaispituus = 0;

        for (int i = 0; i < sanalista.size(); i++) {
            String sana = sanalista.get(i);
            kokonaispituus += sana.length();
        }
    }
}
