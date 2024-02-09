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
                   System.out.println("Taldearen izena?");
                   talizena= sc.next();
                   ma.gehitulangiletaldean(talizena,l1);
                   break;
               case 5:
                   System.out.println("Zein lagile nahi duzu mugitu?");
                   System.out.println("Zein taldeara?");
                   ma.lagileaAldatu();
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
        tadeak.put(taldea, new HashSet<>());
    }

    private void ezabatutaldea(String taldea){
       tadeak.remove(taldea);
    }

    private void gehitulangiletaldean(String taldea,Langilea langilea){
        tadeak.get(taldea).add(langilea);
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
}