public class Estatistika {

    private int estatistika;
    private int kopuru;

    private int bataz;
    public  Estatistika(){
       this.estatistika=0;
       this.kopuru=0;
       this.bataz=0;
    }

    public void gehituZenbakia(int zenbakia){
        System.out.println(zenbakia);
        estatistika=estatistika+zenbakia;
        kopuru++;
    }

    public void jasoKopurua(){
        System.out.println("Gehitu totala= "+ kopuru);
    }

    public void Estatistika_bat(){
        bataz=estatistika/kopuru;
        System.out.println(bataz);
    }
}
