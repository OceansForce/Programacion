import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean aktibatu= true;
        int a=0;
        System.out.println("Bete array bat goraka ordenatutako 10 zenbaki osoekin:");
        int [] Array= new int [10];

        for (int i =0; i < 10; i++) {
            int zenb1 = sc.nextInt();
            Array[i]= zenb1;
        }

        System.out.println("Sartu array-an dagoen zenbaki bat:");
        int zenb = sc.nextInt();
        sc.close();

        while (aktibatu && zenb >= Array[a]){
            if (Array[a]==zenb) {
                System.out.println("Sartutako zenbakiaren posizioa "+a+" da.");
                aktibatu= false;
            }
            else {
                a++;
            }
        }

        if (!aktibatu){
            System.out.println("Sartu duzun zenbakia ez dago array-an");
        }



    }
}