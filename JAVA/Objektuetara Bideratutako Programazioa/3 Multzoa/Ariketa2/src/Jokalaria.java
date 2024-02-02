public class Jokalaria {
    String izena;
    Dado dadoa;

    public Jokalaria(String izena1, Dado dado1){
        this.izena=izena1;
        this.dadoa=dado1;
    }

    public void jaurti(){
        this.dadoa.jaurti();
    }

    public int jasoBalio(){

        return  this.dadoa.zenb1;
    }

    public void erakutsi(){
        System.out.println("Jokalariaren izena: "+izena);
        dadoa.erakutsi();
    }
}
