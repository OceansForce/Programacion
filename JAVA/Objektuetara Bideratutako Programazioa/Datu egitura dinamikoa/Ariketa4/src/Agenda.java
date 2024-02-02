import java.util.*;

public class Agenda {
Scanner sc = new Scanner(System.in);
    private HashMap<String, String[]> sarrerak;
     private final int sarraKopMAX ;

    public Agenda(int sarraKopMAX) {
        this.sarrerak = new HashMap<>();
        this.sarraKopMAX = sarraKopMAX;
    }

    void gehituSarrera(String izena, String[] telefonoa){

        if (sarraKopMAX==sarrerak.size()){
            System.out.println("Agenda beteta dago");
        }
        else if (this.sarrerak.containsValue(telefonoa)){
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

    void erakutsi(){
        Iterator<String[]> it1 = this.sarrerak.values().iterator();
        Iterator<String> it2 = this.sarrerak.keySet().iterator();

        while (it1.hasNext() && it2.hasNext()) {
            System.out.println(it2.next()+"= "+Arrays.toString(it1.next()));
            System.out.println("******************************************************");
        }
    }

    void bilatuizena (String izena){
        if (sarrerak.get(izena)!=null){
            System.out.println(izena+"= "+Arrays.toString(sarrerak.get(izena)));
        }else {
            System.out.println(izena+" ez dago agendan");
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
    
    void zenbakiKopurua(String telefonoa){
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
        System.out.println(pertsonaKOP+" Pertsonak dute telefono hori.");
    }


}
