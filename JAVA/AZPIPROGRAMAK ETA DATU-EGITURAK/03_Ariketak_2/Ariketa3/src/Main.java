import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Sartu NANaren zenbakia:");
        int dni_zenb= sc.nextInt();

        String[] letra_DNI ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int a = dni_zenb%23;

        System.out.println("Sartutako zenbakiari dagokion NANa:"+dni_zenb+letra_DNI[a]);

    }
}