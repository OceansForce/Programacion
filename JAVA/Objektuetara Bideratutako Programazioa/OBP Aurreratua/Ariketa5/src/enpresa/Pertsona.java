package enpresa;

public class Pertsona {

    private String izena;
    private String NAN;
    private float altuera;

    public Pertsona( String izena, String NAN, float altuera){
        this.izena=izena;
        this.NAN=NAN;
        this.altuera=altuera;
    }

    @Override
    public String toString() {
        return "Pertsona{" +
                "izena='" + izena + '\'' +
                ", NAN='" + NAN + '\'' +
                ", altuera=" + altuera +
                '}';
    }
}
