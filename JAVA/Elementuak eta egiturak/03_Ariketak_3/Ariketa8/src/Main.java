import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Sartu zenbaki oso bat:");
        int zenb1 = sc.nextInt();
        int zenb2=1;


        for (int i=0; i<zenb1; i++){

            for (int a=zenb1; a>i; a--){
                System.out.print(" ");
                System.out.print("\t");
            }

            for (int b=0; b<=i; b++){
                System.out.print("\t");
                System.out.print(zenb2);
                System.out.print("\t");
                zenb2++;
            }
            System.out.print("\n");
        }

    }
}