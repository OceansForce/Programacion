import java.util.HashMap;
import java.util.Objects;

public class Kirolaria {
    private String izena;
    private int adina;
    enum Espezialitateak {
        KORRIKALARI,
        TXIRRINDULARI,
        IGERILARI
    }

    private Espezialitateak espezialitateak;

    public Kirolaria(String izena, int adina) {
        this.izena = izena;
        this.adina = adina;
    }

    public Kirolaria(String izena, int adina, Espezialitateak espezialitateak) {
        this.izena = izena;
        this.adina = adina;
        this.espezialitateak = espezialitateak;
    }

    Espezialitateak getEspezialitateak() {
        return espezialitateak;
    }

    String getIzena() {
        return izena;
    }

    int getAdina() {
        return adina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kirolaria kirolaria = (Kirolaria) o;
        return adina == kirolaria.adina && Objects.equals(izena, kirolaria.izena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(izena, adina);
    }
}
