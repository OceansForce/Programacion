package langileak;

public class OrdukoLangile extends Langile {
    private int orduak;
    private float tarifa;

    public OrdukoLangile(String izena, String abizena, int gsz, int orduak, float tarifa){
        super(izena, abizena, gsz);
        if(orduak<0){
            this.orduak=0;
        }
        else {
            this.orduak=orduak;
        }
        if (tarifa<0){
            this.tarifa=0;
        }
        else {
            this.tarifa=tarifa;
        }
    }

    @Override
    public float irabaziak() {
        double orduextrak=0;
        if (this.orduak>40){
            orduextrak= this.tarifa*1.5;
        }
        return (float) ((this.orduak*this.tarifa)+orduextrak);
    }

    public String toString(){
        return super.toString()+" Orduak= "+this.orduak+" Tarifa= "+this.tarifa;
    }

}
