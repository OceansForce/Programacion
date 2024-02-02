public class Jokoa {

    Jokalaria[] jokalariak;
    Jokalaria jokalari_izena;

    int kount;

    public Jokoa(){
        this.jokalariak = new Jokalaria[10];
        kount=0;
    }
    public void gehituJokalaria(Jokalaria izena){
        if (kount<10) {
            jokalariak[kount]=izena;
            kount++;
        }
        else if (kount>10) {
            System.out.println("Jokalari maximoa 10 dira");
        }
    }

    public int jokalariKop(){
        return kount;
    }
}
