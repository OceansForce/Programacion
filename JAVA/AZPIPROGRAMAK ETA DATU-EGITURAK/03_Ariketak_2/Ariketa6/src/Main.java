import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float batura=0;
        float batezbestekoa=0;

        System.out.println("Sartu Ikasle kopurua:");
        int ikasle_kop = sc.nextInt();

        float[] notak= new float [ikasle_kop];

        System.out.println("Sartu Ikasleen notak:");

        for (int a=0; a<ikasle_kop ; a++){
            float ikasle_not = sc.nextFloat();
            notak[a]=ikasle_not;
            batura=batura+ikasle_not;
        }

        sc.close();

        batezbestekoa=batura/ikasle_kop;
        System.out.println("Sartu noten batezbestekoa: "+batezbestekoa);
        System.out.println("Hauek dira batezbesteko baino altuagoak diren notak:");
        for (int b=0; b<notak.length; b++){
            if (notak[b]>batezbestekoa){
                System.out.println(notak[b]);
            }
        }

    }
}