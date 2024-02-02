import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean aktibatu= true;
        int a=0;
        System.out.println("Sartu 5 zenbaki oso:");
        int [] zenb= new int[6];
        for (int i=0; i<6-1; i++){
            int zenb1= sc.nextInt();
            zenb[i]=zenb1;
        }

        System.out.println("Array-a txertatu behar den zenbaki osoa:");
        int pop = sc.nextInt();
        sc.close();

        while (aktibatu){
            if(zenb[a]<pop){
                for (int c=6; c>zenb[a]; c--){
                    zenb[c-1]=zenb[c-2];
                }
                zenb[a]=pop;
                aktibatu= false;
            }
            a++;
        }

        System.out.println("Hau da bukaerako array-a:");
        for (int k=0; k<6; k++){
            System.out.print(zenb[k]);
            if (k<5){
                System.out.print(" - ");
            }
        }
    }
}