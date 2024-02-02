import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Beste lehen array-a hamar zenbaki osoekin:");
        int[] zenb1= new int[10];

        for (int i =0 ; i < 10; i++) {
            int zenb = sc.nextInt();
            zenb1[i] = zenb;
        }

        System.out.println("Beste bigarren array-a hamar zenbaki osoekin:");
        int[] zenb2= new int[10];

        for (int a =0 ; a < 10; a++) {
            int zenb = sc.nextInt();
            zenb2[a] = zenb;
        }

        System.out.println("Eskatutako emaitza:");
        int[] zenb3= new int[20];

        for (int b=0; b<10; b++){
           zenb3[b]=zenb1[b];
           zenb3[b+10]=zenb2[b];
        }
        int g = 0;
        int e = 0;
        boolean hamar = true;
        for (int j=0; j<20; j++){
            if (hamar){
                System.out.print(zenb3[g]);
                g++;
                hamar = false;
            }else {
                System.out.print(" - "+zenb3[e+10]);
                if (j <19){
                    System.out.print(" - ");
                }
                
                e++;
                hamar = true;
            }

        }
    }
}