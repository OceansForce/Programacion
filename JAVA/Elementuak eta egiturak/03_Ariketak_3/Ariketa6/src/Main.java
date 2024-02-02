import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu zenbaki osoa");
        int zenb1 = sc.nextInt();


        for (int i=0;i<=zenb1;i++){

            for (int j=zenb1;j<i;j--){

                System.out.print(" ");
            }
            for (int b=0;b<i;b++){

                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}