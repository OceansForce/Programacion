import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Sartu 1 eta 10 arteko zenbaki bat (biak barne):");
                int zenb1 = sc.nextInt();
        sc.close();
        int min = 1;
        int max = 10;
        int zenb2 = 1;

        for (zenb2 = min; zenb2 <=max; zenb2++) {
            System.out.println(zenb2+" x "+zenb1+" = "+zenb2*zenb1);
        }

    }
}