package langileak;

public class  SoldatapekoLangile extends Langile /*implements Ordaingarri*/{

    private float astekoSoldata;


    public SoldatapekoLangile(String izena, String abizena, int gsz, float astekoSoldata){
        super(izena, abizena, gsz);
        if (astekoSoldata<0) {
            this.astekoSoldata = 0;
        }
        else {
            this.astekoSoldata=astekoSoldata;
        }
    }

    public float irabaziak() {
        return this.astekoSoldata;
    }

    public String toString(){
        return super.toString()+" astekoSoldata= "+astekoSoldata+"/n";
    }


    public float jasoOrdaintzekoKantitate(float kobratu){
        return 2;
    }


}
