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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Langilea langilea)) return false;
        return Objects.equals(getTaldea(), langilea.getTaldea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaldea());
    }


    public Lanmota getLanmota() {
        return lanmota;
    }

    public String getTaldea() {
        return taldea;
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
