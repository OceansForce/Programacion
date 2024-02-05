import java.util.*;

public class Agenda {

    private HashMap<String, String[]> sarrerak;
    private final int sarraKopMAX ;

    public Agenda(int sarraKopMAX) {
        this.sarrerak = new HashMap<>();
        this.sarraKopMAX = sarraKopMAX;
    }

    private void gehituSarrera(String izena, String[] telefonoa){
        Scanner sc = new Scanner(System.in);
        if (sarraKopMAX==sarrerak.size()){
            System.out.println("Agenda beteta dago");
        }
        else if (this.sarrerak.containsKey(izena)){
            System.out.println("“Zure agendan "+izena+"ren ondorengo\n" +
                    "zenbakiak gordeta daude: "+ Arrays.toString(telefonoa) +". Telefono " +
                    "berriengatik aldatu nahi dituzu? Bai/Ez.” ");
            String aldatu= sc.next();
            if (aldatu.equals("Bai")){
               this.sarrerak.put(izena,telefonoa);
            }
        }else {
            this.sarrerak.put(izena,telefonoa);
        }
    }

    private void erakutsi(){
        Iterator<String> it2 = this.sarrerak.keySet().iterator();

        while ( it2.hasNext()) {
            String gako= it2.next();
            System.out.println(gako+"= "+Arrays.toString(sarrerak.get(gako)));

            System.out.println("******************************************************");
        }
    }

    private String bilatuizena (String izena){
        if (sarrerak.get(izena)!=null){
            return izena+"= "+Arrays.toString(sarrerak.get(izena));
        }else {
           return  izena+" ez dago agendan";
        }
    }

   /* void zenbakiKopurua(String telefonoa){
        int pertsonaKOP=0;
        Iterator<String> it2 = this.sarrerak.keySet().iterator();
        String katea = telefonoa+",0,0";
        String[] array = katea.split(",");
        while (it2.hasNext()){
            String telefonoEnMapa = it2.next();
            if (sarrerak.containsValue(array)) {

                pertsonaKOP++;
            }
        }
        System.out.println(pertsonaKOP+" Pertsonak dute telefono hori.");
    }*/
    
    private int zenbakiKopurua(String telefonoa){
        int pertsonaKOP=0;
        Iterator<String> it = this.sarrerak.keySet().iterator();

        while (it.hasNext()){
            String izena= it.next();
            String[] telefonoak= sarrerak.get(izena);

            for (int i=0 ; i<telefonoak.length; i++){
                if (telefonoak[i]==telefonoa){
                    pertsonaKOP++;
                }
            }
        }
       return pertsonaKOP;
    }

    void main(Agenda a1){
        String[] telefonoak= {"5456435","32","8695769854"};
        String[] telefonoak2= {"32","435567676","09689076"};
        String[] telefonoak3= {"7879879","46534230","32"};
        a1.gehituSarrera("Julen", telefonoak);
        a1.gehituSarrera("Iker", telefonoak2);
        a1.gehituSarrera("Manex", telefonoak3);
        a1.erakutsi();
        a1.bilatuizena("Julen");
        a1.bilatuizena("Manex");
        a1.zenbakiKopurua("32");
    }

}
