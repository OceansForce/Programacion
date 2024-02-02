import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("1 eta 100 arteko zenbaki ezkutua asmatu:");
        byte egia =0;
        int zenb2 =0;

        int zenbrandom = rand.nextInt(101);



        while (egia==0) {
            int zenb1 = sc.nextInt();


            zenb2 = zenb2 + 1;
            if (zenb1 == zenbrandom) {


                if (zenb2==1 || zenb2==2){
                    System.out.println("Asmatu duzu, zorte onekoa zara, ezta?");
                    egia=1;
                }
                else if (zenb2==3 || zenb2==4) {
                    System.out.println("Asmatu duzu, benetan azkarra zara!");
                    egia=1;
                }
                else if (zenb2==5 || zenb2==6) {
                    System.out.println("Asmatu duzu, nahiko ondo moldatu zara.");
                    egia=1;
                }
                else if (zenb2==7 || zenb2==8) {
                    System.out.println("Asmatu duzu, kostata ala?");
                    egia=1;
                }
                else if (zenb2==9 || zenb2==10) {
                    System.out.println("Asmatu duzu, baina laguntzarik behar al duzu?");
                    egia=1;
                }
            }

            if (zenb2 == 10){
                System.out.println("Ez duzu zenbakia asmatzea lortu, saiatu berriro!");
                egia=1;
                System.exit(0);
            }

            else if (zenb1 != zenbrandom && zenb2 < 10 ) {

                System.out.println("Ez duzu asmatu, saiatu berriro");

                if (zenb1 < zenbrandom){
                    System.out.println("Zenbaki handiagoa da");
                }

                else if (zenb1 > zenbrandom){
                    System.out.println("Zenbaki txikiagoa da");
                }

            }
        }
        sc.close();
    }
}