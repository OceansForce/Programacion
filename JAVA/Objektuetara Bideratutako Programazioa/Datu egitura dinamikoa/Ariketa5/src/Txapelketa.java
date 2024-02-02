import java.util.HashSet;
import java.util.Iterator;

public class Txapelketa {

    HashSet<Kirolari> kirolariak_KORRI;
    HashSet<Kirolari> kirolariak_TXIRRIN;
    HashSet<Kirolari> kirolariak_IGERI;

    public Txapelketa() {
        this.kirolariak_KORRI = new HashSet<Kirolari>();
        this.kirolariak_TXIRRIN = new HashSet<Kirolari>();
        this.kirolariak_IGERI = new HashSet<Kirolari>();
    }

    void gehituKirolaria(Kirolari kirolaria){
        if (Kirolari.Espezialitateak.IGERILARI.equals(kirolaria.getEspezialitateak())){
            kirolariak_IGERI.add(kirolaria);
        } else if (Kirolari.Espezialitateak.KORRIKALARI.equals(kirolaria.getEspezialitateak())) {
            kirolariak_KORRI.add(kirolaria);
        }else {
            kirolariak_TXIRRIN.add(kirolaria);
        }
    }

    void aldatuEspezialitatea(Kirolari kirolaria, Kirolari.Espezialitateak espezialitatea){
        if (Kirolari.Espezialitateak.IGERILARI.equals(kirolaria.getEspezialitateak())){
            kirolariak_IGERI.remove(kirolaria);

            if(espezialitatea.equals(Kirolari.Espezialitateak.KORRIKALARI)){
                kirolariak_KORRI.add(kirolaria);
            }else {
                kirolariak_TXIRRIN.add(kirolaria);
            }

        } else if (Kirolari.Espezialitateak.KORRIKALARI.equals(kirolaria.getEspezialitateak())) {
            kirolariak_KORRI.remove(kirolaria);

            if(espezialitatea.equals(Kirolari.Espezialitateak.IGERILARI)){
                kirolariak_IGERI.add(kirolaria);
            }else {
                kirolariak_TXIRRIN.add(kirolaria);
            }

        }else {
            kirolariak_TXIRRIN.remove(kirolaria);

            if(espezialitatea.equals(Kirolari.Espezialitateak.KORRIKALARI)){
                kirolariak_KORRI.add(kirolaria);
            }else {
                kirolariak_IGERI.add(kirolaria);
            }
        }
    }

    void erakutsiKirolarirak (){
        System.out.println("Igerilariak");
        for (Kirolari kirolari: kirolariak_IGERI) {
            System.out.println(kirolari.getIzena()+" Adina="+kirolari.getAdina());
        }
        System.out.println("********************************************");
        System.out.println("Txirrindulariak");
        for (Kirolari kirolari: kirolariak_TXIRRIN) {
            System.out.println(kirolari.getIzena()+" Adina="+kirolari.getAdina());
        }
        System.out.println("********************************************");
        System.out.println("Korrikalariak");
        for (Kirolari kirolari: kirolariak_KORRI) {
            System.out.println(kirolari.getIzena()+" Adina="+kirolari.getAdina());
        }
        System.out.println("********************************************");
    }


}
