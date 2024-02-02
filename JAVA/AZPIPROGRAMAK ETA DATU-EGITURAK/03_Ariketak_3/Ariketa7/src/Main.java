import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1etik 20 arteko zenbaki ausazkoen array-a:");
        int [] zenb= new int [12];
        boolean g=false;
        for (int i=0 ; i<10; i++){
            int zenb1= sc.nextInt();
            zenb[i]=zenb1;
        }

        sc.close();

        for ( int b=12; b>1; b--){
            zenb[b-1]=zenb[b-2];
            if (b==2) {
                g = true;
            }
        }
        if (g){
            zenb[0]=zenb[10];
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