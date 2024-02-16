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
}
