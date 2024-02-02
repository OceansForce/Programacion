import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu autobus ibilbide kantitatea:");
        int kant = sc.nextInt();
        float prez = 0;
        float ibil = 0;
        float merke = 0;
        float totprez = 0;
        float bbPrez = 0;
        for (int i = 1; i < kant; i++) {
            System.out.println("Sartu " + i + " irteeera hiriko lehen letra:");
            String irte = sc.next();
            System.out.println("Sartu " + i + " helmuga hiriko lehen letra:");
            String helm = sc.next();
            System.out.println("Sartu " + i + " ibilbidearean distantzia:");
            ibil = sc.nextFloat();
            System.out.println("Sartu " + i + " ibilbidearean prezioa:");
            prez = sc.nextFloat();

        }

        if (ibil > 50) {
            totprez = prez + prez;
            bbPrez = totprez / kant;
            System.out.println("50km baino gehiagoko ibilbidearen prezioaren bateztestekoa " + bbPrez + "da");

        }
        String kar;
       


    }
}