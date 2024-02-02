package elementuak;

public class Elementu {

    protected String identifikazioa;
    protected String izenburua;
    protected String egilea;
    public Elementu(String identifikazioa, String izenburua, String egilea){
        this.identifikazioa=identifikazioa;
        this.izenburua=izenburua;
        this.egilea=egilea;
    }

    public void elementuaErakutxi(){
        System.out.println("Identifikazioa= "+this.identifikazioa);
        System.out.println("Izenburua= "+this.izenburua);
        System.out.println("Egilea= "+this.egilea);
    }


}
