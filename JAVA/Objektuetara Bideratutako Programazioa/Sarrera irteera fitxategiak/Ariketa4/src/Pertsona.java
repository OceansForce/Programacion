import java.util.Objects;

public class Pertsona {

    String izena;
    long telefonoa;
    String herria;

    public Pertsona(String izena, long telefonoa, String herria) {
        this.izena = izena;
        this.telefonoa = telefonoa;
        this.herria = herria;
    }


    public String toString() {
        return "izena=" + izena + "\t" +
                "telefonoa=" + telefonoa + "\t" +
                "herria=" + herria + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Pertsona pertsona)) return false;
        return Objects.equals(izena, pertsona.izena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(izena);
    }
}
