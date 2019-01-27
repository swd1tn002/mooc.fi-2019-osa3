package tehtava17;

import java.util.ArrayList;

/**
 * Luo tehtäväpohjaan metodi public static void
 * poistaViimeinen(ArrayList<String> mjonot). Metodin tulee poistaa parametrina
 * saadusta listasta viimeisin arvo. Mikäli lista on tyhjä, metodin ei tule
 * tehdä mitään.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class PoistaViimeinen {

    public static void main(String[] args) {
        ArrayList<String> merkkijonot = new ArrayList<>();

        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");

        System.out.println(merkkijonot);

        poistaViimeinen(merkkijonot);
        poistaViimeinen(merkkijonot);

        System.out.println(merkkijonot);
    }

    public static void poistaViimeinen(ArrayList<String> mjonot) {
        // TODO: Toteuta metodin sisältö tänne
    }
}
