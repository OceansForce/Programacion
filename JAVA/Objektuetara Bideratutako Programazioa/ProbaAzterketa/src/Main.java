import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<String,HashSet<Langilea>> ta= new HashMap<>();

       Langilea l1= new Langilea("Julen", "Garcia", 19, "Readbull", Langilea.Lanmota.Pilotoa);

       Main ma= new Main(ta);
       boolean bukatu= true;


       while (bukatu){
           System.out.println("1-Erakutsi\t2-Talde bat gehitu\n3-Ezabatu talde bat\t4-Gehitu langile bat talde batean\n5-Langile bat taldez aldatu\t6-Aplikazioa itxi");
           int aukera= sc.nextInt();
           switch (aukera){
               case 1:
                   ma.erakutsi();
                   break;
               case 2:
                   System.out.println("Taldearen izena?");
                   String talizena= sc.next();
                   ma.gehitutaldea(talizena);
                   break;
               case 3:
                   System.out.println("Taldearen izena?");
                   talizena= sc.next();
                   ma.ezabatutaldea(talizena);
                   break;
               case 4:
                   //ma.gehitulangiletaldean();
                   ma.gehitulangiletaldean(l1);
                   break;
               case 5:
                   System.out.println("Zein lagile nahi duzu mugitu eta se taldera?");
                   ma.lagileaAldatu(l1, sc.next());
                   break;
               case 6:
                   bukatu=false;
                   break;
           }
       }

    }


    HashMap<String,HashSet<Langilea>> tadeak;

    public Main(HashMap<String, HashSet<Langilea>> tadeak) {
        this.tadeak = tadeak;
    }

    public  void erakutsi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zein taldea nahi duzu ikusi:");
        String taldea= sc.next();
        System.out.println("1-Pilotoak     2-Ingeniariak       3-Zuzendariak");
        int aukera= sc.nextInt();


        switch (aukera){
            case 1:
                for(HashSet<Langilea> la: tadeak.values()){
                    for (Langilea langilea : la) {
                        if (langilea.getLanmota() == langilea.lanmota.Pilotoa && langilea.getTaldea().equals(taldea)) {
                            System.out.println(la);
                        }
                    }

                }
                break;
            case 2:
                for(HashSet<Langilea> la: tadeak.values()){
                    for (Langilea langilea : la) {
                        if (langilea.getLanmota() == langilea.lanmota.Ingeniaria && langilea.getTaldea().equals(taldea)) {
                            System.out.println(la);
                        }
                    }

                }
                break;

            case 3:
                for(HashSet<Langilea> la: tadeak.values()){
                    for (Langilea langilea : la) {
                        if (langilea.getLanmota() == langilea.lanmota.Zuzendaria && langilea.getTaldea().equals(taldea)) {
                            System.out.println(la);
                        }
                    }

                }
                break;
        }
    }

    private void gehitutaldea(String taldea){
        try {
            if (tadeak.containsKey(taldea)){
                throw new Exception("Taldea existitzen da");
            }
            tadeak.put(taldea, new HashSet<>());

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private void ezabatutaldea(String taldea){
        try {
            if (!tadeak.containsKey(taldea)){
                throw new Exception("Taldea ez da existitzen");
            }

            tadeak.remove(taldea);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private void lagileaAldatu(Langilea langilea, String taldea){
        Iterator<String> itKEY = tadeak.keySet().iterator();
        while (itKEY.hasNext()){
            String a= itKEY.next();
            HashSet<Langilea> langileak= tadeak.get(a);
            if (langileak.contains(langilea)){
                tadeak.get(taldea).add(langilea);
                tadeak.get(a).remove(langilea);
            }
        }
    }

    // Langilea metodo barruan sortzen
    /*private void gehitulangiletaldean(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Izena idatzi:");
        String izena=sc.next();

        System.out.println("Abizena idatzi:");
        String abizena=sc.next();

        System.out.println("Adina idatzi:");
        int adina= sc.nextInt();

        System.out.println("Taldearen izena?");
        String taldea= sc.next();
        try {

            if(!tadeak.containsKey(taldea)){
                throw new Exception("Talde hori ez da existitzen");
            }

            System.out.println("Langile mota jarri: 1-Pilotoa, 2-Ingeniaria edo 3-Zuzendaria");
            int mota=sc.nextInt();

            HashSet<Langilea> lantaldea= tadeak.get(taldea);
            switch (mota) {
                case 1:

                        int kantitatea=0;

                        for (Langilea a: lantaldea){
                          if (a.getLanmota() == Langilea.Lanmota.Pilotoa){
                                kantitatea++;
                                System.out.println(kantitatea);
                          }
                        }
                        if (kantitatea>=3){
                            throw new Exception("Piloto geilegi daude, MAX 3");
                        }
                    Langilea c= new Langilea(izena, abizena, adina, taldea, Langilea.Lanmota.Pilotoa);
                    tadeak.get(taldea).add(c);
                    break;

                case 2:
                    tadeak.get(taldea).add(new Langilea(izena, abizena, adina, taldea, Langilea.Lanmota.Ingeniaria));
                    break;

                case 3:
                        for (Langilea a: lantaldea){
                            if (a.getLanmota()==Langilea.Lanmota.Zuzendaria){
                                throw new Exception("Zuzendari bat dago, ezin da beste bat geitu");
                            }
                            tadeak.get(taldea).add(new Langilea(izena, abizena, adina, taldea, Langilea.Lanmota.Zuzendaria));
                        }


                    break;
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }*/

    // Langilea lenagotik sartzen
    private void gehitulangiletaldean(Langilea la){
        Scanner sc = new Scanner(System.in);

        System.out.println("Taldearen izena?");
        String taldea= sc.next();
        try {

            if(!tadeak.containsKey(taldea)){
                throw new Exception("Talde hori ez da existitzen");
            }

            System.out.println("Langile mota jarri: 1-Pilotoa, 2-Ingeniaria edo 3-Zuzendaria");
            int mota=sc.nextInt();

            HashSet<Langilea> lantaldea= tadeak.get(taldea);
            switch (mota) {
                case 1:

                    int kantitatea=0;

                    for (Langilea a: lantaldea){
                        if (a.getLanmota() == Langilea.Lanmota.Pilotoa){
                            kantitatea++;
                            System.out.println(kantitatea);
                        }
                    }
                    if (kantitatea>=3){
                        throw new Exception("Piloto geilegi daude, MAX 3");
                    }

                    la.setLanmota(Langilea.Lanmota.Pilotoa);
                    break;

                case 2:
                    la.setLanmota(Langilea.Lanmota.Ingeniaria);
                    break;

                case 3:
                    for (Langilea a: lantaldea){
                        if (a.getLanmota()==Langilea.Lanmota.Zuzendaria){
                            throw new Exception("Zuzendari bat dago, ezin da beste bat geitu");
                        }
                        la.setLanmota(Langilea.Lanmota.Zuzendaria);
                    }
                    break;
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}