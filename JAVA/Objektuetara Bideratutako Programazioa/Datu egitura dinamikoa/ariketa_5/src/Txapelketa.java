import java.util.HashSet;
import java.util.Iterator;

public class Txapelketa {

    private HashSet<Kirolaria> kirolariak_KORRI;
    private HashSet<Kirolaria> kirolariak_TXIRRIN;
    private HashSet<Kirolaria> kirolariak_IGERI;
    private HashSet<Kirolaria> duatletak;
    private HashSet<Kirolaria> triatletak;

    public Txapelketa() {
        this.kirolariak_KORRI = new HashSet<Kirolaria>();
        this.kirolariak_TXIRRIN = new HashSet<Kirolaria>();
        this.kirolariak_IGERI = new HashSet<Kirolaria>();
        this.duatletak = new HashSet<Kirolaria>();
        this.triatletak = new HashSet<Kirolaria>();
    }

    void gehituKirolaria(Kirolaria kirolaria){
        if (Kirolaria.Espezialitateak.IGERILARI.equals(kirolaria.getEspezialitateak())){
            kirolariak_IGERI.add(kirolaria);
        } else if (Kirolaria.Espezialitateak.KORRIKALARI.equals(kirolaria.getEspezialitateak())) {
            kirolariak_KORRI.add(kirolaria);
        }else {
            kirolariak_TXIRRIN.add(kirolaria);
        }
    }

    void aldatuEspezialitatea(Kirolaria kirolaria, Kirolaria.Espezialitateak espezialitatea){
        if (Kirolaria.Espezialitateak.IGERILARI.equals(kirolaria.getEspezialitateak())){
            kirolariak_IGERI.remove(kirolaria);

            if(espezialitatea.equals(Kirolaria.Espezialitateak.KORRIKALARI)){
                kirolariak_KORRI.add(kirolaria);
            }else {
                kirolariak_TXIRRIN.add(kirolaria);
            }

        } else if (Kirolaria.Espezialitateak.KORRIKALARI.equals(kirolaria.getEspezialitateak())) {
            kirolariak_KORRI.remove(kirolaria);

            if(espezialitatea.equals(Kirolaria.Espezialitateak.IGERILARI)){
                kirolariak_IGERI.add(kirolaria);
            }else {
                kirolariak_TXIRRIN.add(kirolaria);
            }

        }else {
            kirolariak_TXIRRIN.remove(kirolaria);

            if(espezialitatea.equals(Kirolaria.Espezialitateak.KORRIKALARI)){
                kirolariak_KORRI.add(kirolaria);
            }else {
                kirolariak_IGERI.add(kirolaria);
            }
        }
    }

    void erakutsiKirolarirak (){
        System.out.println("Igerilariak");
        for (Kirolaria kirolari: kirolariak_IGERI) {
            System.out.println(kirolari.getIzena()+" Adina="+kirolari.getAdina());
        }
        System.out.println("********************************************");
        System.out.println("Txirrindulariak");
        for (Kirolaria kirolari: kirolariak_TXIRRIN) {
            System.out.println(kirolari.getIzena()+" Adina="+kirolari.getAdina());
        }
        System.out.println("********************************************");
        System.out.println("Korrikalariak");
        for (Kirolaria kirolari: kirolariak_KORRI) {
            System.out.println(kirolari.getIzena()+" Adina="+kirolari.getAdina());
        }
        System.out.println("********************************************");
    }

    void duatletak () {
        System.out.println("Duatletak:");

        for (Kirolaria kirolari1 : kirolariak_KORRI) {

            for (Kirolaria kirolari2: kirolariak_IGERI) {

                for (Kirolaria kirolari3: kirolariak_TXIRRIN) {

                        if (kirolari1.equals(kirolari2)) {

                            if (!duatletak.contains(kirolari1)) {
                                duatletak.add(kirolari1);
                                System.out.println(kirolari1.getIzena() + " Adina=" + kirolari1.getAdina());
                            }

                        } else if (kirolari1.equals(kirolari3)) {

                            if (!duatletak.contains(kirolari1)) {
                                duatletak.add(kirolari1);
                                System.out.println(kirolari1.getIzena() + " Adina=" + kirolari1.getAdina());
                            }

                        } else if (kirolari2.equals(kirolari3)) {

                            if (!duatletak.contains(kirolari2)) {
                                duatletak.add(kirolari2);
                                System.out.println(kirolari2.getIzena() + " Adina=" + kirolari2.getAdina());
                            }
                        }
                }
            }
        }
        System.out.println("********************************************");
    }

    void triatletak(){
        triatletak.addAll(kirolariak_KORRI);
        triatletak.retainAll(kirolariak_IGERI);
        triatletak.retainAll(kirolariak_TXIRRIN);

        System.out.println("Triatletak:");
        for (Kirolaria triatleta:triatletak) {
            System.out.println(triatleta.getIzena() + " Adina=" + triatleta.getAdina());
        }
        System.out.println("********************************************");
    }


}
