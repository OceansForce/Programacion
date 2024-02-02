import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu hamar zenbaki oso:");

        int[] zenbakiak = new int[10];

        for (int i=0 ; i<10; i++){
            int zenb = sc.nextInt();
            zenbakiak[i] = zenb;
        }
        for (int z=0 ; z<10; z++){
            System.out.println(z+". porsizioan "+zenbakiak[z]+" balioa gorde da.");
        }
        sc.close();


    }
}