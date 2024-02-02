package elementuak;

public class Diskoak extends Elementu {
    private String izena;
    public Diskoak (String identifikazioa, String izenburua, String egilea, String izena){
        super(identifikazioa, izenburua, egilea);
        this.izena=izena;
    }

    public void erakutsi(){
        System.out.println("Identifikazioa= "+this.identifikazioa);
        System.out.println("Izenburua= "+this.izenburua);
        System.out.println("Egilea= "+this.egilea);
        System.out.println("Izena= "+this.izena);
    }
}
