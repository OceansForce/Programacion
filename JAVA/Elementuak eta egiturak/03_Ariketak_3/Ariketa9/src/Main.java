import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu zenbaki oso bat");
        int zenb1 = sc.nextInt();
        int ñ=zenb1-1;

        for (int i=0; i<=zenb1; i++){ //filas

            for (int j=0; j<i; j++) { //asteriskos
                System.out.print("*");
            }
            System.out.print("\n"); //saltos
        }
        for (int b=0; b<zenb1; b++){ //filas

            for (int c=0; c<=b; c++) { //espacios
                System.out.print(" ");
            }
            for (int z=ñ; z>b; z-- ){ //asteriskos
                System.out.print("*");
            }
            System.out.print("\n"); //saltos
        }
    }
}