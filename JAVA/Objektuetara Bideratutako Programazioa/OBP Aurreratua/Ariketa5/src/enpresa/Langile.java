package enpresa;

public class Langile extends Pertsona {

    private float diru;
    private Mugikor telefonoa;

    private Enpresa enpresa;
    public Langile(String izena, String NAN, float altuera, float diru, Mugikor telefonoa) {
        super(izena, NAN, altuera);
        this.diru = diru;
        this.telefonoa=telefonoa;
    }

    private void diruaIrabasi(float irabazia) {
        this.diru = this.diru + irabazia;
    }

    private void diruaGastatu(float gastatu) {
        this.diru = this.diru - gastatu;
    }

    public void lanEgin(){
        this.diruaIrabasi(10);
        this.telefonoa.erabili();
    }

    @Override
    public String toString() {
        return "Langile{" +
                " diru= " + diru +
                " Bateria= "+telefonoa.getBateria()+
                '}';
    }
}
