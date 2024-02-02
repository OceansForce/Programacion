public class Piolin extends Kanario{

    private int zenbatPiolin;
    Piolin (char sexua, int adina, DatuPertsonal izenak, int tamaina){
        super( sexua,  adina, izenak,  tamaina);
        this.zenbatPiolin++;
    }

    @Override
    void abestu() {
        System.out.println("Nire izena "+getIzenak()+" da eta pio-pio abesten dut");
    }
}
