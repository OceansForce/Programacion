public class KontuKorronte {

    private String izena;
    private double dirukant;

    public KontuKorronte (String izena1){
        izena=izena1;
        dirukant=0;
    }

    public KontuKorronte (String izena2, float dirukant1){
        izena=izena2;
        dirukant=dirukant1;
    }



    public void diruaKendu(double dir){
        if (dir>dirukant){
            System.out.println("Ez");
            System.out.println();
            dirukant=0;
        }
    }

    public double diruaKendu(float diruken){
        if ((dirukant-diruken)<=0){
            dirukant=dirukant-diruken;
            return dirukant;
        }
        else if ((dirukant-diruken)>0) {
            dirukant=dirukant-diruken;
            return dirukant;
        }
        return dirukant;
    }

    public void erakutsiKontua(){
        System.out.println("Kontu Izena= "+izena);
        System.out.println("Diru kantitatea= "+dirukant);
    }


}


    /*public double diruGordailua(float dirugeitu){
        dirukant=dirukant+dirugeitu;
        return dirukant;
    }

    public void diruGordailua(double dir){
        dirukant=dirukant+dir;
        System.out.println(dirukant);
    }*/