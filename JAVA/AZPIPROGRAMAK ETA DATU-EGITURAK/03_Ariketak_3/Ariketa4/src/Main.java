import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Beste lehen array-a hamar zenbaki osoekin:");
        int[] zenb1 = new int[9];

        for (int i = 0; i < 9; i++) {
            int zenb = sc.nextInt();
            zenb1[i] = zenb;
        }

        System.out.println("Beste bigarren array-a hamar zenbaki osoekin:");
        int[] zenb2 = new int[9];

        for (int a = 0; a < 9; a++) {
            int zenb = sc.nextInt();
            zenb2[a] = zenb;
        }

        System.out.println("Eskatutako emaitza:");
        int[] zenb3 = new int[18];

        for (int b = 0; b < 10; b++) {
            zenb3[b] = zenb1[b];
            zenb3[b + 10] = zenb2[b];
        }

        int g = 0;
        int e = 0;
        boolean hamar = true;
        for (int j = 0; j < 6; j++) {
            if (hamar) {
                if (j !=0 && j < 5) {
                    System.out.print(" - ");
                }
                System.out.print(zenb3[g]);
                System.out.print(" - " +zenb3[g+1]);
                System.out.print(" - " +zenb3[g+2]);
                g=g+3;
                hamar = false;
            }
            else {
                System.out.print(" - " + zenb3[e + 10]);
                System.out.print(" - " + zenb3[e + 11]);
                System.out.print(" - " + zenb3[e + 12]);

                e=e+3;
                hamar = true;
            }
        }
    }
}
