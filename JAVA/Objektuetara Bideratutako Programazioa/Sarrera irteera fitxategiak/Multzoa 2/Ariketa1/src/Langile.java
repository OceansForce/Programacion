import java.io.Serializable;

public class Langile implements Serializable {
    private String izena;
    private long soldata;
    private Mugikor mugikorra;

    public Langile(String izena, long soldata, Mugikor mugikorra) {
        this.izena = izena;
        this.soldata = soldata;
        this.mugikorra = mugikorra;
    }

    String erakutsi(){
        return izena+"\t"+soldata+"[ "+mugikorra+" ]";
    }

    void lanEgin(){
        soldata=soldata+10;
        mugikorra.deitu(15);
    }

    void lanEgin(long jasotakoSoldata, int denbora){
        soldata=soldata+jasotakoSoldata;
        mugikorra.deitu(denbora);
    }

    public String getIzena() {
        return izena;
    }

    @Override
    public String toString() {
        return  izena+ "\t" + soldata +
                "\t" + mugikorra+"\n";
    }
}
