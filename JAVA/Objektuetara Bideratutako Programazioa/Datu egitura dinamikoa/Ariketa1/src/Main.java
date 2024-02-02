import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<Integer> zenb1 = new ArrayList<>();

        //zatigarriak(zenb1);
        //erakutsi(zenb1);

        //random1(zenb1);
        //erakutsi(zenb1);

        random_ez_errepikatu(zenb1, 10, 20);
        erakutsi(zenb1);
    }
    public static void zatigarriak(ArrayList zenb1) {
        Scanner sc= new Scanner(System.in);
        boolean aktibo = true;

        while (aktibo) {

            System.out.println("Sartu zenbaki bat:");
            int zenb = sc.nextInt();

           int i=1;
           while (i<= zenb && zenb1.size()<10){
               if (zenb%i==0){
                   zenb1.add(i);
               }
               i++;
           }
            if (zenb1.size() != 10) {
                System.out.println("Ez dazka 10 zatitzaile");
                zenb1.clear();
            }else {
                aktibo = false;}
        }
    }

    public static void erakutsi(ArrayList zenb1){

        for (int b = 0; b < zenb1.size(); b++) {
            if (b>=1){
                System.out.print(" ");
            }
            System.out.print(zenb1.get(b));
        }
        zenb1.clear();
    }

    public static void random(ArrayList zenb1, int luzera, int zenbakia){
        System.out.println("");
        Random rm= new Random();
        while (zenb1.size()<luzera){
            boolean negatibo= rm.nextBoolean();
            if (negatibo){
                zenb1.add(rm.nextInt(zenbakia+1)*(-1));
            }else {
                zenb1.add(rm.nextInt(zenbakia+1));
            }
        }
    }

    public static void random_ez_errepikatu(ArrayList zenb1, int luzera, int zenbakia){
        System.out.println("");
        Random rm= new Random();
        int zenb;
        while (zenb1.size()<luzera) {
            boolean negatibo = rm.nextBoolean();
            if (negatibo) {
                zenb = rm.nextInt(zenbakia+1) * (-1);
                if (!zenb1.contains(zenb)) {
                    zenb1.add(zenb);
                } else {
                    zenb = rm.nextInt(zenbakia+1);
                    if (!zenb1.contains(zenb)) {
                        zenb1.add(zenb);
                    }
                }
            }
        }
    }
}
