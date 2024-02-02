import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();

        int [] zenb= new int [12];
        boolean g=false;
        for (int i=0 ; i<10; i++) {
            zenb[i] = random.nextInt(20);
        }

        System.out.println("1etik 20 arteko zenbaki ausazkoen array-a:");
        for (int a=0; a<10; a++){
            System.out.print(zenb[a]);
            if (a<9){
                System.out.print(" - ");
            }
        }
        System.out.println("\n");

        System.out.println("Sartu zenbat posizio behar den");
        int pop= sc.nextInt();

        if (pop!=0){
            pop=pop-1;
        }
        sc.close();

        for ( int b=12; b>pop; b--){
            if(b!=1){
                zenb[b-1]=zenb[b-2];
            }
            if (b==pop+1) {
                g = true;
            }
        }

        if (g){
            zenb[pop]=zenb[10];
        }

        System.out.println("Hau da bukaerako array-a:");
        for (int a=0; a<10; a++){
            System.out.print(zenb[a]);
            if (a<9){
                System.out.print(" - ");
            }
        }
    }
}