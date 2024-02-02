import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("1 eta 10 arteko zenbaki ezkutua asmatu:");
        byte egia =0;

        int zenbrandom = rand.nextInt(11);

        while (egia==0) {
            int zenb1 = sc.nextInt();

            System.out.println("Ez duzu asmatu, saiatu berriro");


            if (zenb1 == zenbrandom) {
                    System.out.println("Oso ondo, asmatu duzu! "+zenb1+" da zenbaki ezkutua");
                    egia=1;
            }
        }

        sc.close();

    }
}