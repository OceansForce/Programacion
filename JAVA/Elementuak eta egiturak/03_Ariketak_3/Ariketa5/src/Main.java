import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Sartu zenbaki oso bat");
        int zenb1 = sc.nextInt();
        int j = 0;
        int zenb2= zenb1-1;

        for (int i=0;i<=zenb1;i++){

            for (j=0;j<i;j++){

                System.out.print("*");
            }
            System.out.print("\n");

        }
        for (int i=0;i<=zenb1;i++){

            for (int b=zenb2;b>i;b--){
                System.out.print("*");

            }
            System.out.print("\n");
        }


    }
}