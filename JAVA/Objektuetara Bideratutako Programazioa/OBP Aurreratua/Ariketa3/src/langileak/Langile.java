package langileak;
public abstract class Langile {

    private String izena;
    private String abizena;
    private int gsz;

    public Langile( String izena, String abizena, int gsz){
        this.izena=izena;
        this.abizena=abizena;
        this.gsz=gsz;
    }

    public abstract float irabaziak();

    public String toString(){
        return "Izena= "+izena+" Abizena= "+abizena+" Gsz= "+gsz;
    }
}
