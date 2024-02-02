package langileak;

public class KomisioLangile extends Langile {
    private float salmentak;
    private float komisioa;

    public KomisioLangile(String izena, String abizena, int gsz, float salmentak, float komisioa){
        super(izena, abizena, gsz);
        if (salmentak<0) {
            this.salmentak = 0;
        }
        else {
            this.salmentak=salmentak;
        }
        if (komisioa>0 && komisioa<1){
            this.komisioa= 0;
        }
        else {
            this.komisioa=komisioa;
        }
    }
    public float irabaziak() {
        return (salmentak*komisioa);
    }

    public String toString(){
        return super.toString()+" Salmentak= "+salmentak+" Komisioa= "+komisioa;
    }

    public float getSalxKom(){
        return (salmentak*komisioa);
    }

}
