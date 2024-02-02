package langileak;

import langileak.KomisioLangile;

public class SoldatapekoKomisioLangile extends KomisioLangile {
    private float oinarrizkoSoldata;

    public  SoldatapekoKomisioLangile(String izena, String abizena, int gsz, float salmentak, float komisioa, float oinarrizkoSoldata){
        super(izena, abizena, gsz, salmentak, komisioa);
        if(oinarrizkoSoldata>0){
            this.oinarrizkoSoldata=oinarrizkoSoldata;
        }
    }

    @Override
    public float irabaziak() {
        return super.irabaziak()+(oinarrizkoSoldata+getSalxKom());
    }

    public String toString(){
        return super.toString()+" Oinarrizko Soldata= "+oinarrizkoSoldata;
    }
}
