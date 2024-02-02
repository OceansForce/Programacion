package enpresa;

public class Enpresa {
    private String izena;
    private float irabaziak;
    private Langile jabea;
    private Langile gerentea;

    public Enpresa(String izena, float irabaziak, Langile jabea) {
        this.izena = izena;
        this.irabaziak = irabaziak;
        this.jabea = jabea;
    }

    public void kontratatuGerentea (Langile legilebat){
        this.gerentea=legilebat;
    }

    public void lana (){
        this.irabaziak=this.irabaziak+100;
        this.jabea.lanEgin();
        this.gerentea.lanEgin();

    }

    @Override
    public String toString() {
        return "Enpresa{" +
                "izena='" + izena + '\'' +
                ", irabaziak=" + irabaziak +
                ", jabea=" + jabea +
                ", gerentea=" + gerentea +
                '}';
    }
}
