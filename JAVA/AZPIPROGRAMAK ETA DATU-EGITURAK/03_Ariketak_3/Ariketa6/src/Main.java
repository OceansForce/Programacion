import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Sartu 9 zenbaki oso 10 elementuko array batean:");
        int [] zenb= new int [11];

        for (int i =0; i < 9; i++) {
           int zenb1 = sc.nextInt();
           zenb[i]= zenb1;
        }
        System.out.println("Sartu txertatu behar den beste zenbaki oso bat");
        int zenb2 = sc.nextInt();

        System.out.println("Sartu zenbakia txestatu nahi duzun posizioan (0-9)");
        int pop = sc.nextInt();

        sc.close();

        for (int b=11; b>pop; b--){
            zenb[b-1]=zenb[b-2];
        }
        zenb[pop]=zenb2;

        for (int a=0; a<10; a++){
            System.out.print(zenb[a]);
            if (a<9){
                System.out.print(" - ");
            }
        }
    }
}