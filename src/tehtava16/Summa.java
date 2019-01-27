package tehtava16;

import java.util.ArrayList;

/**
 * Luo tehtäväpohjaan metodi public static int summa(ArrayList<Integer> luvut).
 * Metodin tulee palauttaa parametrina annetun listan lukujen summa.
 *
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class Summa {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);
        System.out.println(summa(luvut));

        luvut.add(5);
        luvut.add(1);
        System.out.println(summa(luvut));
    }

    public static int summa(ArrayList<Integer> luvut) {
        // TODO: toteuta metodin sisältö
        return 0;
    }
}
