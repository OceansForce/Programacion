import java.util.HashMap;

public class Kirolari {
    private String izena;
    private int adina;
    public enum Espezialitateak {
        KORRIKALARI,
        TXIRRINDULARI,
        IGERILARI
    }

    private Espezialitateak espezialitateak;

    public Kirolari(String izena, int adina) {
        this.izena = izena;
        this.adina = adina;
    }

    public Kirolari(String izena, int adina, Espezialitateak espezialitateak) {
        this.izena = izena;
        this.adina = adina;
        this.espezialitateak = espezialitateak;
    }

    public Espezialitateak getEspezialitateak() {
        return espezialitateak;
    }

    public String getIzena() {
        return izena;
    }

    public int getAdina() {
        return adina;
    }
}
