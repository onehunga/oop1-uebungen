package j.michels.uebungen.autohaus;

import java.util.ArrayList;
import java.util.List;

public class Autohaus {

    private List<Abschluss> abschlussListe = new ArrayList<>();

    public void abschlussHinzufuegen(Abschluss abschluss) {
        this.abschlussListe.add(abschluss);
    }

    public Abschluss wetvollsterAbschluss() {
        if(this.abschlussListe.isEmpty()) {
            return null;
        }
        Abschluss groesterAbschluss = this.abschlussListe.getFirst();
        for(Abschluss abschluss : this.abschlussListe) {
            if(abschluss.getWert() > groesterAbschluss.getWert()) {
                groesterAbschluss = abschluss;
            }
        }
        return groesterAbschluss;
    }
}
