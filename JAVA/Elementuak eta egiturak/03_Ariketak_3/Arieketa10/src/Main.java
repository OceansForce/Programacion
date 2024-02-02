import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Sartu zenbaki oso bat:");
        int zenb1 = sc.nextInt();
        int r=zenb1-1;


        for (int i=1; i<zenb1+1; i++){ //filas

            for (int a=zenb1; a>i; a--){ //espacios
                System.out.print("  ");

            }

            for (int b=1; b<i*2; b++){ //asteriscos

                    System.out.print(" ");
                    System.out.print("*");


            }
            System.out.print("\n");
        }

        for (int d=r; d>0; d--){

            for (int c=0; c<zenb1-d; c++){
                System.out.print("  ");
            }

            for (int z=1; z<d*2 ;z++ ){ //asteriscos
                    System.out.print(" ");
                    System.out.print("*");
            }
            System.out.print("\n");
        }




    }
}