public class Main {
    public static void main(String[] args) {

        Kirolari k1= new Kirolari("Julen", 19, Kirolari.Espezialitateak.KORRIKALARI);
        Kirolari k2= new Kirolari("Manex", 32, Kirolari.Espezialitateak.TXIRRINDULARI);
        Kirolari k3= new Kirolari("Edwar", 12, Kirolari.Espezialitateak.IGERILARI);
        Kirolari k4= new Kirolari("Alfonso", 11, Kirolari.Espezialitateak.IGERILARI);

        Txapelketa t1 =new Txapelketa();

        t1.gehituKirolaria(k1);
        t1.gehituKirolaria(k2);
        t1.gehituKirolaria(k3);
        t1.gehituKirolaria(k4);


        t1.erakutsiKirolarirak();
    }
}