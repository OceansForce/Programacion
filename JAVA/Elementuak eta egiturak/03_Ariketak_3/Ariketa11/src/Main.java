import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zenbaki oso bat jarrri?");
        int zenb1 = sc.nextInt();


        for (int i=0; i<zenb1; i++){ // saltos de filas

            System.out.print("*");

            if (i == 0 || i == zenb1-1){

                for (int a=0; a<zenb1; a++){ //filas 1 y 2
                    System.out.print(" *");
                }
            }
            else {
                for (int v=0; v<zenb1-1; v++){ //resto de filas
                    System.out.print("  ");
                }
                System.out.print(" *");
            }


            System.out.print("\n");
        }
    }
}