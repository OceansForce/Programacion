package surf;

public class OlatuHandikoSurflari extends Surflari{

    private int olatuAtuera;
    private boolean motorraDu;

    public OlatuHandikoSurflari(String izena, int rankingPos, int energia, Babesle babestea, int olatuAtuera, boolean motorraDu) {
        super(izena, rankingPos, energia, babestea);
        this.olatuAtuera = olatuAtuera;
        this.motorraDu = motorraDu;
    }

    @Override
    public void surfeatu() {
        int energia=getEnergia();
        if ((energia=energia-15)<0){
            energia=0;
            setEnergia(energia);
        }else{
            energia=energia-15;
            setEnergia(energia);
        }
    }
    String erakutsi(){
        return "olatuAtuera=" + olatuAtuera +", motorraDu=" + motorraDu;
    }
    @Override
    public String toString() {
        return "olatuAtuera=" + olatuAtuera +", motorraDu=" + motorraDu;
    }
}
