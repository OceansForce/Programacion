import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu produktu kopuru bat:");
        int kop = sc.nextInt();
        System.out.println("Sartu produktuaren prezioa:");
        float prez = sc.nextFloat();

        sc.close();

        float prez2= prez*kop;
        float prez_des= prez;
        if (kop < 10 && prez >= 0) {
            System.out.println("Ez du deskonturik");
            System.out.println("Ordaindu beharrekoa "+prez_des+"€ dira.");
        }

        else if (kop >= 10 && prez >= 0) {
            Random random = new Random();
            float probabilitatea = random.nextFloat(11);

            if (probabilitatea >= 7.5){
                prez_des = prez2-(prez2*0.1f);
                prez_des = prez_des*100;
                float prez_des1 = Math.round(prez_des);
                prez_des1= prez_des1/100;
                System.out.println("%10ko deskontua duzu!");
                System.out.println("Ordaindu beharrekoa "+prez_des1+"€ dira.");
            }

            else if (probabilitatea < 7.5){
                prez_des = prez2-(prez2*0.2f);
                prez_des = prez_des*100;
                float prez_des1 = Math.round(prez_des);
                prez_des1= prez_des1/100;
                System.out.println("%20ko deskontua duzu!");
                System.out.println("Ordaindu beharrekoa "+prez_des1+"€ dira.");
            }

        }

        else {
            System.out.println("Kopurua edo prezioa ezin dira negatiboak izan.");
        }



    }
}