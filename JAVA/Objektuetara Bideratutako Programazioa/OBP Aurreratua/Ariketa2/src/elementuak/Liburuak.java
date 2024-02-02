package elementuak;

import elementuak.Elementu;

public class Liburuak extends Elementu {

    int orrialdeKop;
    public Liburuak (String identifikazioa, String izenburua, String egilea, int orrialdeKop){
        super(identifikazioa, izenburua, egilea);
        this.orrialdeKop=orrialdeKop;
    }

    public void kodeOsoa(){
        System.out.println("Identifikazioa= "+this.identifikazioa);
        System.out.println("Izenburua= "+this.izenburua);
        System.out.println("Orrialde Kopurua= "+this.orrialdeKop);
    }
}
