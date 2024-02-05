import java.util.ArrayList;
import java.util.Iterator;

public class Zinema {

    String izena;
    ArrayList<Pelikula> pelikulak;
    Pelikula aretoa[];
    int aretoaKop=1;


    public Zinema(String izena, int aretoa) throws Salbuespenak{
        try {
            if (izena.equals("")){
                throw new Salbuespenak("Zinemaren izena ezin da hutsa jarri");
            }
        }catch (Salbuespenak e){
            System.err.println("Error= "+e.getMessage());
        }
        try {
            if (aretoa<=0){
                throw new Salbuespenak("Zinemaren aretoak ezin dira izan 0 edo negatibo");
            }
        }catch (Salbuespenak e){
            System.err.println("Error= "+e.getMessage());
        }
        this.izena = izena;
        this.pelikulak=new ArrayList<>();
        this.aretoa= new Pelikula[aretoa+1];
    }

    /*public void pelikularenAretoa(Pelikula datuak){
        System.out.println("Aretoko Pelikulak: ");
        for (int i=0; i<aretoa.length; i++){
            if (aretoa[i]!=null && aretoa[i].equals(datuak)){
                System.out.println("**************************************************************");
                System.out.println("Aretoa-"+i+" "+aretoa[i]);
            }
            if (i==aretoa.length-1){
                System.out.println("**************************************************************");
            }
        }
    }*/
    
    int pelikularenAretoa (String izena, int urtea, int iraupena) throws Salbuespenak {
        Pelikula peli = new Pelikula(izena ,urtea, iraupena);
        for (int i=1 ; i<this.aretoa.length; i++){
            if (this.aretoa[i]!=null && this.aretoa[i].equals(peli)){
                return (i+1);
            }
        }
        System.out.println("refedsfdsfds");
        return -1;
    }

    public void gehituPelikula(Pelikula pelikula){
        if ( this.aretoa [aretoaKop]!=null){
            this.aretoa [aretoaKop]= pelikula;
            aretoaKop++;
        }
        this.pelikulak.add(pelikula);

    }
    public void gehituPelikula(Pelikula pelikula, int aretoaKop){
        int luzera=1;
        boolean itzali= true;
        while (itzali){
            if (aretoa[luzera]!=null){
                luzera++;
                if (luzera==aretoa.length){
                    System.out.println("Ezin duzu sartu");
                    itzali= false;
                }
            } else if (pelikulak.contains(pelikula)) {
                    System.out.println("Ezin duzu sartu");
            } else {
                if (aretoa[aretoaKop]!=null){
                    this.aretoa [aretoaKop]= pelikula;
                    itzali= false;
                    luzera++;
                    aretoaKop++;
                } else {
                    System.out.println("Ezin duzu sartu");
                    itzali= false;
                }
            }
        }
    }


    public void erakutsi(){
        System.out.println(this.izena);
        for (int i=1; i<aretoa.length; i++){
            if (aretoa[i]!=null){
                System.out.println("**************************************************************");
                System.out.println("Aretoa-"+i+" "+aretoa[i]);
            }
            if (i==aretoa.length-1){
                System.out.println("**************************************************************");
            }
        }
    }

    void ezabatu (String izen){
        Iterator<Pelikula> it= this.pelikulak.iterator();
        while (it.hasNext()){
            Pelikula peli = it.next();
            if (peli.izenburua.startsWith(izen)){
                it.remove();

            }
        }
    }




}
