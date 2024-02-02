import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zenbaki oso positiboa bat:");
        int zenb1= sc.nextInt();
        int ondarra;
        int lehenak=zenb1;
        int erantzuna=zenb1;
        System.out.println("Hau da "+zenb1+" zenbakiaren deskonposaketa");

        for (int i=1; i<=zenb1; i++){

            ondarra= zenb1%i;

            if (ondarra==0){
                lehenak=lehenak/i;
                System.out.println("/"+i);

                for (int b=0; b==0;b++ ){
                    erantzuna=erantzuna/lehenak;
                    System.out.println(lehenak);
                }
            }
        }
        sc.close();
    }
}