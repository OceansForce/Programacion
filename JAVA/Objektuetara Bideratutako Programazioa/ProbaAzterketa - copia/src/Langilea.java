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

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public int getAdina() {
        return adina;
    }

    public Lanmota getLanmota() {

        return lanmota;
    }

    public void setLanmota(Lanmota lanmota) {
        this.lanmota = lanmota;
    }

    public String getTaldea() {
        return taldea;
    }

    public void setTaldea(String taldea) {
        this.taldea = taldea;
    }

    @Override
    public String toString() {
        return "izena='" + izena + '\'' +
                ", abizena='" + abizena + '\'' +
                ", adina=" + adina +
                ", taldea='" + taldea + '\'' +
                ", lanmota=" + lanmota;
    }
}
