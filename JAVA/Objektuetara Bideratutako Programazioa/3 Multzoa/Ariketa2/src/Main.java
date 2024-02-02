
public class Main {
    public static void main(String[] args) {

        int max=0;

        Jokoa joko = new Jokoa();

        Jokalaria j1= new Jokalaria("Unai", new Dado());
        Jokalaria j2= new Jokalaria("Julen", new Dado());
        Jokalaria j3= new Jokalaria("Manex", new Dado());

        joko.gehituJokalaria(j1);
        joko.gehituJokalaria(j2);
        joko.gehituJokalaria(j3);

        int[] balioak =new int [joko.jokalariKop()];
        int[] seiKop = new int [joko.jokalariKop()];

        for (int i=0; i<6;i++){
            for (int b=0; b<joko.kount; b++){

                joko.jokalariak[b].jaurti();
                balioak[b]= balioak[b] + joko.jokalariak[b].jasoBalio();
                if (joko.jokalariak[b].jasoBalio()==6){
                    seiKop[b]++;
                }
            }
        }

        for (int c=0; c<10; c++){
            if (seiKop[c]>max){
                max=seiKop[c];
            }
        }


    }
}