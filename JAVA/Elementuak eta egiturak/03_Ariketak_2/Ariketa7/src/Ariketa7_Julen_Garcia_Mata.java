import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int semekop =0;
        float totafasold= 0;
        int geilago = 0;
        float azaltotala=0;
        float azaltotala2=0;
        int kode2= 0;

        for (int i=1; i<=4; i++){ //Probintzia
            System.out.println("Jarri "+i+" probintziaren kodea:");
            int kode1 = sc.nextInt();

            System.out.println("Jarri " + i + " probintziaren herri kopurua:");
            int herri1 = sc.nextInt();

            for (int a=1; a<=herri1; a++) { //Herria
                System.out.println("Jarri " + a + " herriaren kodea:");
                int herkode1 = sc.nextInt();

                System.out.println("Jarri " + a + " herriaren azalera:");
                float azalera = sc.nextFloat();

                System.out.println(a + " herriaren familia kopurua");
                int fakop = sc.nextInt();

                azaltotala =  azaltotala+azalera;


                for (int c = 1; c <= fakop; c++) { //Familia
                    System.out.println("Jarri " + c + " familiare kodea:");
                    int fakod = sc.nextInt();

                    System.out.println("Jarri " + c + " familiaren soldata");
                    float fasold = sc.nextFloat();

                    System.out.println("Jarri " + c + " familiaren seme-alaba kopurua");
                    semekop = sc.nextInt();

                    totafasold = totafasold + fasold;

                    if (semekop>=3){
                        geilago= geilago + 1;
                    }

                }
                float batasbest = totafasold * herri1;
                System.out.println(batasbest);
            }

            System.out.println(geilago+" familea 3 seme baino geilago dituzte");

            float azaltotalabb= azaltotala/herri1;
            if (azaltotalabb<azaltotala2){
                kode2= kode1;
                azaltotala2= azaltotalabb;
            }
            System.out.println(kode2+" Azalera handiena");
        }
    }
}