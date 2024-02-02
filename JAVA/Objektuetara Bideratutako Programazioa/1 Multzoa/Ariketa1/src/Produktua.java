public class Produktua {
    String Izena;
    double prezio;
    int kopuru;

    public Produktua(String i, double p, int k){
        this.Izena=i;
        this.prezio = p;
        this.kopuru= k;
    }

    public void erakutsiProduktua(){
        System.out.println(Izena+" - "+prezio+"€ - "+ kopuru);
    }
}
