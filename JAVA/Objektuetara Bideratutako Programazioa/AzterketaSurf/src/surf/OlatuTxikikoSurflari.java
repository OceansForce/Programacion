package surf;

public class OlatuTxikikoSurflari extends Surflari{

    private int tablaLuzera;

    public OlatuTxikikoSurflari(String izena, int rankingPos, int energia, Babesle babestea, int tablaLuzera) {
        super(izena, rankingPos, energia, babestea);
        this.tablaLuzera = tablaLuzera;
    }

    String erakutsi(){
        return  "tablaLuzera=" + tablaLuzera ;
    }

    @Override
    public String toString() {
        return "OlatuTxikikoSurflari{" +
                "tablaLuzera=" + tablaLuzera +
                '}';
    }
}
