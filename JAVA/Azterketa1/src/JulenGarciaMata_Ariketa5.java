import java.util.Scanner;
public class JulenGarciaMata_Ariketa5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int biztanleria=0;
        int tamaina_kop=0;
        int erainkin_kop_tam=0;
        int prest=0;
        int min=0;
        boolean hasiera=true;
        int portal_zenb1=0;
        String izena1="";

        System.out.println("Auzo kantitatea");
        int auzo_kant = sc.nextInt();

        for (int a=0; a<auzo_kant;a++) {

            biztanleria=0;
            System.out.println("Auzoaren izena:");
            String izena = sc.next();
            System.out.println("Eraikin kopurua:");
            int eraikin_kop = sc.nextInt();

            for (int i = 0; i < eraikin_kop; i++) {
                System.out.println("Portal zenbakia");
                int portal_zenb = sc.nextInt();

                System.out.println("Eraikinaren altuera");
                float altuera = sc.nextFloat();

                System.out.println("Etxebizitza kopurua:");
                int etxebz_kop = sc.nextInt();

                for (int c = 0; c < etxebz_kop; c++) {

                    System.out.println("identifikadorea");
                    int ident = sc.nextInt();

                    System.out.println("Tamaina (m2)");
                    double azalera = sc.nextDouble();

                    if (azalera>70){
                        tamaina_kop++;
                    }
                    if (tamaina_kop==(etxebz_kop/2)){
                        erainkin_kop_tam++;
                    }

                    System.out.println("Mugikortasun mugatuko pertsonentzat prestatuta (Bai edo Ez):");
                    String mugikortasun = sc.next();

                    if (mugikortasun.equals("Bai")){
                        prest++;
                    }

                    System.out.println("Bizi diren pertsona kopurua:");
                    int per_kop = sc.nextInt();

                    biztanleria = biztanleria + per_kop;
                }
                if (hasiera){
                    min=prest;
                    hasiera=false;
                }
                if (prest<min){
                    min=prest;
                    portal_zenb1=portal_zenb;
                    izena1=izena;
                }

            }
            System.out.println(biztanleria);
            System.out.println(erainkin_kop_tam);
            System.out.println("Portal zenbakia= "+portal_zenb1+"    "+"Auzo izena= "+izena);
        }
        sc.close();
    }
}