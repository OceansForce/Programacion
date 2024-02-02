import java.util.Scanner;
public class JulenGarciaMata_Ariketa6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int zenb=1;
        System.out.println("Zenbaki bat sartu:");
        int zenb1= sc.nextInt();

        for (int i=0; i<zenb1*2; i++){

            for (int a=zenb1; a>0; a--){
                System.out.print(" ");
            }
            for (int j=0; j<zenb1*2; j++){
                if ((zenb1-1)==(i+j)){
                    System.out.print(zenb);
                }
            }
            for (int b=0; b<((zenb1*2)-2); b++){
                System.out.print(" ");
            }
            for (int k=0; k<zenb1*2; k++){
                if ((zenb1-1)==(i-k)){
                    System.out.print(zenb);
                }
            }
            System.out.print("\n");

            zenb++;
        }
        sc.close();

        /*for (int g=0; g<5;g++){
            for (int h=0; h<10;h++){
                System.out.print(g+h);
                System.out.print(" ");
            }
            System.out.println("");
        }

        for (int g=0; g<5;g++){
            for (int h=0; h<10;h++){
                System.out.print(g-h);
                System.out.print(" ");
            }
            System.out.println("");
        }*/

    }
}
