public class Txori {

    private char sexua;
    private int adina;

    protected static int kopurua=0;

    Txori( char sexua, int adina){
        kopurua++;
        this.adina=adina;
        this.sexua=sexua;
    }

    public void txoriKop(){
        System.out.println(kopurua);
    }

    public void norNaiz(){
        System.out.println("Sexua: "+sexua);
        System.out.println("Adina: "+adina);
    }


}
