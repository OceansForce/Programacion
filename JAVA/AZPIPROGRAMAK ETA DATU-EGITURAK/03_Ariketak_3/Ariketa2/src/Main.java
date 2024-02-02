import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bai=0;

        System.out.println("Sartu hamar zenbaki oso:");
        int[] zenb = new int[10];

        for (int i=0; i<10; i++){
            int zenb1 = sc.nextInt();
            zenb[i]=zenb1;
        }
        System.out.println("Eskatutako emaitza:");

        for (int a=0; a<5; a++) {
            System.out.print(zenb[a]+ " - ");

            if (a ==4){
                System.out.print(zenb[5]);
            }
            else {
                System.out.print(zenb[9-a]+ " - ");
            }
        }
    }
}