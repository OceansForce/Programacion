import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String eragiketa ="";
        int totala = 0;
        int zenbat = 0;

        while (zenbat < 10 && totala < 100) {
            System.out.print("Sartu zenbaki oso bat:");
            int zenb1 = sc.nextInt();
            totala = totala+zenb1;
            zenbat++;

            eragiketa += (zenbat == 1) ? zenb1 : " + " + zenb1;
        }

        if (totala >= 100) {
            System.out.println("Exekuzioa amaitu da, sartutako zenbakien batura 100en berdina edo handiagoa da.");
        } else {
            System.out.println("Exekuzioa amaitu da, 10 zenbaki sartu dituzu.");
        }

        System.out.println(eragiketa +" = "+ totala);

        sc.close();
    }
}

