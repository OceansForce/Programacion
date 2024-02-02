public abstract class Txori  {

    private char sexua;
    private int adina;

    private static int kopurua=0;

    private DatuPertsonal izenak;


    Txori( char sexua, int adina, DatuPertsonal izenak){
        kopurua++;
        this.adina=adina;
        this.sexua=sexua;
        this.izenak=izenak;
    }

    public int txoriKop(){

       return kopurua;
    }

    public void norNaiz(){
        System.out.println("Sexua: "+sexua);
        System.out.println("Adina: "+adina);
    }

    public static int getKopurua() {
        return kopurua;
    }

    public String getIzenak() {
        return izenak.getTxoriIzena();
    }

    abstract void abestu();
}
