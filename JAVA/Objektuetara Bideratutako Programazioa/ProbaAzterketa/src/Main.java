import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        File f1 = new File(".\\Taldeak_eta_Langileak.txt");
        //HashMap-ArrayList aukeratu dut horrela talde bakoitza arraylist bat izango du nahi dituen langile kantitatea sartzeko.
        HashMap<String,ArrayList<Langilea>> ta= new HashMap<>();
        Main ma= new Main(ta);
        boolean bukatu= true;
        ma.sartudatuak();



       while (bukatu){
           System.out.println("1-Erakutsi\t2-Talde bat gehitu\n3-Ezabatu talde bat\t4-Gehitu langile bat talde batean\n5-Langile bat taldez aldatu\t6-irakurriTXTa \t7-Aplikazioa itxi");
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
                   ma.gehitulangiletaldean();
                   break;
               case 5:
                   ma.lagileaAldatu();
                   break;
               case 6:
                   ma.irakurriTXTa();
                   break;
               case 7:
                   bukatu=false;
                   break;
           }
       }

    }


    HashMap<String,ArrayList<Langilea>> tadeak;

    public Main(HashMap<String, ArrayList<Langilea>> tadeak) {
        this.tadeak = tadeak;

        //Aurreneko bi taldeak:
        tadeak.put("A", new ArrayList<>());
        tadeak.put("B", new ArrayList<>());
    }

    public  void erakutsi(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Zein taldea nahi duzu ikusi:");
            String taldea = sc.next();

            if (!tadeak.containsKey(taldea)) {
                throw new Exception("Taldea ez da existitzen");
            }

            System.out.println("1-Pilotoak     2-Ingeniariak       3-Zuzendariak");
            int aukera= sc.nextInt();


            switch (aukera){
                case 1:
                    for(ArrayList<Langilea> la: tadeak.values()){
                        for (Langilea langilea : la) {
                            if (langilea.getLanmota() == langilea.lanmota.Pilotoa && langilea.getTaldea().equals(taldea)) {
                                System.out.println(langilea);
                            }
                        }
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    for(ArrayList<Langilea> la: tadeak.values()){
                        for (Langilea langilea : la) {
                            if (langilea.getLanmota() == langilea.lanmota.Ingeniaria && langilea.getTaldea().equals(taldea)) {
                                System.out.println(langilea);
                            }
                        }
                    }
                    System.out.print("\n");
                    break;

                case 3:
                    for(ArrayList<Langilea> la: tadeak.values()){
                        for (Langilea langilea : la) {
                            if (langilea.getLanmota() == langilea.lanmota.Zuzendaria && langilea.getTaldea().equals(taldea)) {
                                System.out.println(langilea);
                            }
                        }
                    }
                    System.out.print("\n");
                    break;
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private void gehitutaldea(String taldea){
        try {
            if (tadeak.containsKey(taldea)){
                throw new Exception("Taldea existitzen da");
            }
            tadeak.put(taldea, new ArrayList<>());
            fitxategianIdatzi();
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
            fitxategianIdatzi();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private void lagileaAldatu(){
        Scanner sc = new Scanner(System.in);
        Langilea langilea=null;
        boolean bai=false;

        System.out.println("Langilearen izena?");
        String izena= sc.next();
        System.out.println("Langilearen abizena?");
        String abizena= sc.next();
        System.out.println("Langilearen adina?");
        int adina= sc.nextInt();
        System.out.println("Langilearen Taldea?");
        String taldezarra= sc.next();
        System.out.println("Zein taldetara nahi duzu aldatu?");
        String taldeberria= sc.next();

        ArrayList<Langilea> langileak= tadeak.get(taldezarra);
        Iterator<Langilea> it= langileak.iterator();
        while (it.hasNext() && !bai){
            Langilea la= it.next();
            if (la.getIzena().equals(izena) && la.getAbizena().equals(abizena) && la.getAdina()==adina){
                la.setTaldea(taldeberria);
                langilea=la;
                bai=true;
            }
        }
        if (bai && langilea!=null) {
            tadeak.get(taldeberria).add(langilea);
            tadeak.get(taldezarra).remove(langilea);

        }else {
            System.out.println("Langilea ez da aurkitu");
        }
        fitxategianIdatzi();
    }


    // Langileak metodo barruan sortzen dira
    private void gehitulangiletaldean(){
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

            ArrayList<Langilea> lantaldea= tadeak.get(taldea);
            switch (mota) {
                case 1:

                        int kantitatea=0;

                        for (Langilea a: lantaldea){
                          if (a.getLanmota() == Langilea.Lanmota.Pilotoa){
                                kantitatea++;
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
            fitxategianIdatzi();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    void fitxategianIdatzi(){

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(".\\Taldeak_eta_Langileak.txt"));
            Iterator<String> t1= tadeak.keySet().iterator();
            while (t1.hasNext()) {
                String taldea= t1.next()+":";
                ArrayList<Langilea> langileak = tadeak.get(taldea);
                pw.println(taldea);
                for (Langilea la : langileak) {
                    pw.println(la);
                }
                pw.println("----------------------------------------------------");
            }
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException("Fitxategia ez dago");
        }

    }

    void irakurriTXTa() {
        try {

            BufferedReader br1 = new BufferedReader(new FileReader(".\\Taldeak_eta_Langileak.txt"));
            String line;
            while ((line=br1.readLine())!=null){
                System.out.println(line);
            }
            br1.close();
        }catch (IOException e){
            throw new RuntimeException("Fitxategia ez dago");
        }
    }

    void sartudatuak() {
        try {

            BufferedReader br1 = new BufferedReader(new FileReader(".\\Taldeak_eta_Langileak.txt"));
            String line;
            while ((line=br1.readLine())!=null){
               if(line.endsWith(":")){

               } else if (line.equals("----------------------------------------------------")) {

               }else {
                   line = line.replace("'", "");
                   for ( String zatiak: line.split(";")){
                       String [] lista = zatiak.split(",");
                       System.out.println(lista[0]);
                       Langilea lan = new Langilea(lista[0], lista[1], Integer.parseInt(lista[2]), lista[3], Langilea.Lanmota.valueOf(lista[4].toUpperCase()));
                       if (tadeak.containsKey(lan.getTaldea())){
                           tadeak.get(lan.getTaldea()).add(lan);
                       }else {
                           gehitutaldea(lan.getTaldea());
                           tadeak.get(lan.getTaldea()).add(lan);
                       }
                   }

               }
            }
            br1.close();
        }catch (IOException e){
            throw new RuntimeException("Fitxategia ez dago");
        }
    }



}