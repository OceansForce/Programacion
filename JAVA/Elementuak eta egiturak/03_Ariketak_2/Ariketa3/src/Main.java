import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int d = 0;
        int e = 0;
        int kontatu=0;
        int zenb1 = 2;
        long zenb2= 1;
        int zenb3= 1;
        int zenb4= 0;

        while (zenb1 !=0) {

            System.out.println("zenbaki oso  pozitiboak.");
            zenb1 = sc.nextInt();

            if (zenb1 == 0){
                d=1;
                break;
            }
            if(d==0){
                zenb4 += zenb1;
                e++;
            }

            for(int i= 1; i<=zenb1; i++) {

                zenb2 =zenb2*i;

            }
            for(int i= 1; i<=zenb1; i++) {

                if (b==0){
                    i++;
                }
                b=1;

                zenb3 =zenb3+i;

            }
            if (zenb3>100){
                kontatu++ ;
            }
            System.out.println("Faktoriala = "+zenb2);
            System.out.println("Batukaria = "+ zenb3);
            zenb2= 1;
            zenb3= 1;
        }
        zenb4= zenb4*e;
        System.out.println("Batukaria 100 baino geilago izan da "+kontatu+" aldiz.");
        System.out.println("Batezbestekoa = "+zenb4);
    }
}