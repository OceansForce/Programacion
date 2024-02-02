import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float sum_irabaziak=0;
        int sum_adina=0;
        int kop_adina=0;
        float max_irabazia=0;
        String max_irabazia_izena="";

        for (int i=0; i<20; i++){
            sum_irabaziak=0;
            System.out.println("Zein da zure antzinatasuna:");
            int antzinatasuna= sc.nextInt();

            System.out.println("Zein da zure adina:");
            int adina= sc.nextInt();

            if (antzinatasuna>25){
                kop_adina++;
                sum_adina=sum_adina+adina;
            }
            System.out.println("Zenbat Proiektutan:");
            int Proiektu_kan= sc.nextInt();

            for (int a = 0; a <Proiektu_kan; a++) {

                System.out.println(a+". Proiektuaren izena:");
                String Proiektu_izena= sc.next();

                System.out.println(a+". Proiektuaren izena:");
                float Proiektu_irabaziak= sc.nextFloat();

                if (Proiektu_irabaziak>max_irabazia){
                    max_irabazia_izena=Proiektu_izena;
                }

                sum_irabaziak=sum_irabaziak+Proiektu_irabaziak;
            }

            System.out.println(i+". Langilearen irabazi totala");

        }
        System.out.println(sum_adina/kop_adina+" 25 urteko antzinatasuna baino geilago duten adinen batezbestekoa");
        System.out.println(max_irabazia_izena+" Proiektuaren izena.");
        sc.close();


    }
}