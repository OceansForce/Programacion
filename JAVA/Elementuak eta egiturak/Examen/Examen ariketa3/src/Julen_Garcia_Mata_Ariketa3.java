import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float min = 0;
        String irmer = "";
        String helmer= "";
        String helmugac= "";
        int bat= 0;
        float prezkant=0;
        float minc = 0;
        int zenb1=1;

        System.out.println("Zenbat autobus daude");
        int aukant = sc.nextInt();

        for (int i=1; i<=aukant;i++) {

            System.out.println(i+" -ren irtera-ren aurreneko letra eta helmugaren aurreneko letra jarri;");
            String irtera = sc.next();
            String helmug = sc.next();

            System.out.println(i+"-ren ibilbide distanzia jarri:");
            float distan = sc.nextFloat();

            System.out.println(i+"-ren prezioa jarri:");
            float prezioa = sc.nextFloat();

            if (i==1){
                min=prezioa;
                minc=prezioa;
            }

            if (min>prezioa){
                  min=prezioa;
                  irmer= irtera;
                  helmer= helmug;
            }

            if (distan>50){
                bat++;
                prezkant = prezkant+prezioa;
            }

            if (irtera=="D" || irtera=="d"){
                if (minc>prezioa) {
                     minc= prezioa;
                     helmugac= helmug;

                }
                zenb1= 2;
            }
        }

        System.out.println(irmer+" irtera eta "+helmer+" helmuga merkeenak dira");

        double batprez= prezkant/bat;
        System.out.println(batprez+" batazbesteko prezioa.");

        System.out.println("Donostitik ateratzen den ibilbide merkeena "+minc+" balio du eta "+helmugac+"-ra doa.");

        System.out.println(zenb1);
       sc.close();
    }
}