import java.util.*;

public class Langilea {
    private String izena;
    private String abizena;
    private int adina;

    String taldea;

    enum Lanmota{
        Pilotoa,
        Ingeniaria,
        Zuzendaria;
    }

    Lanmota lanmota;
    public Langilea(String izena, String abizena, int adina, String taldea, Lanmota lanmota) {
        this.izena = izena;
        this.abizena = abizena;
        this.adina = adina;
        this.taldea=taldea;
        this.lanmota=lanmota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Langilea langilea = (Langilea) o;
        return Objects.equals(taldea, langilea.taldea) && lanmota == langilea.lanmota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taldea, lanmota);
    }


    public Lanmota getLanmota() {
        return lanmota;
    }

    @Override
    public String toString() {
        return "Langilea{" +
                "izena='" + izena + '\'' +
                ", abizena='" + abizena + '\'' +
                ", adina=" + adina +
                ", taldea='" + taldea + '\'' +
                ", lanmota=" + lanmota +
                '}';
    }
}
