import java.util.Objects;

public class Txakurra extends Animalia implements Maskota {


    enum Mota{
        Seter,
        Ratonero,
        Chiwawa;
    }

    Mota txakurmota;


    public Txakurra(String izena, int adina, Mota txakurmota) {
        super(izena, adina);
        this.txakurmota = txakurmota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Txakurra txakurra = (Txakurra) o;
        return txakurmota == txakurra.txakurmota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(txakurmota);
    }

    @Override
    void animali() {
        System.out.println("Txakur animalia");
    }

    @Override
    public void maskotada() {
        System.out.println("Txakur maskota");
    }
}
