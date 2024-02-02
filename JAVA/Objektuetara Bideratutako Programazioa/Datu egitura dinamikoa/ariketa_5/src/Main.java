public class Main {
    public static void main(String[] args) {

        Kirolaria k1= new Kirolaria("Julen", 19, Kirolaria.Espezialitateak.KORRIKALARI);
        Kirolaria k5= new Kirolaria("Julen", 19, Kirolaria.Espezialitateak.TXIRRINDULARI);

        Kirolaria k2= new Kirolaria("Manex", 32, Kirolaria.Espezialitateak.TXIRRINDULARI);
        Kirolaria k6= new Kirolaria("Manex", 32, Kirolaria.Espezialitateak.IGERILARI);
        Kirolaria k7= new Kirolaria("Manex", 32, Kirolaria.Espezialitateak.KORRIKALARI);

        Kirolaria k3= new Kirolaria("Edwar", 12, Kirolaria.Espezialitateak.IGERILARI);
        Kirolaria k4= new Kirolaria("Alfonso", 11, Kirolaria.Espezialitateak.IGERILARI);
        Kirolaria k8= new Kirolaria("Alfonso", 11, Kirolaria.Espezialitateak.KORRIKALARI);

        Txapelketa t1 =new Txapelketa();

        t1.gehituKirolaria(k1);
        t1.gehituKirolaria(k2);
        t1.gehituKirolaria(k3);
        t1.gehituKirolaria(k4);
        t1.gehituKirolaria(k5);
        t1.gehituKirolaria(k6);
        t1.gehituKirolaria(k7);
        t1.gehituKirolaria(k8);


        t1.erakutsiKirolarirak();
        t1.duatletak();
        t1.triatletak();
    }
}