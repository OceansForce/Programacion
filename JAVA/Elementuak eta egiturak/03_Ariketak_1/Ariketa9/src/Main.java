import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Aukeratu eragiketa bat:");
            System.out.println("1. Batuketa \t2. Kenketa");
            System.out.println("3. Biderketa \t4. Zatiketa");
            System.out.println("5. Berreketa \t6. Hondarra");
            int aukera = sc.nextInt();

            System.out.println("Sartu lehen zenbakia (hamartarra izan daiteke):");
            float zenb1 = sc.nextFloat();

            System.out.println("Sartu bigarren zenbakia (hamartarra izan daiteke):");
            float zenb2 = sc.nextFloat();

            sc.close();

            if (aukera == 1){
               float batuketa = zenb1+zenb2;
               System.out.println("Eragiketaren emaitza "+batuketa+" da.");
            }
            else if (aukera == 2) {
                float kenketa = zenb1-zenb2;
                System.out.println("Eragiketaren emaitza "+kenketa+" da.");
            }
            else if (aukera == 3) {
                float biderketa = zenb1*zenb2;
                System.out.println("Eragiketaren emaitza "+biderketa+" da.");
            }
            else if (aukera == 4 && zenb2 != 0) {
                float zatiketa = zenb1/zenb2;
                System.out.println("Eragiketaren emaitza "+zatiketa+" da.");
            }
            else if (aukera == 5) {
                double berreketa = Math.pow(zenb1, zenb2);
                System.out.println("Eragiketaren emaitza "+berreketa+" da.");
            }
            else if (aukera == 6) {
                double hondarra = zenb1%zenb2;
                System.out.println("Eragiketaren emaitza "+hondarra+" da.");
            }
            else if ( aukera == 4 && zenb2 == 0 ) {
                System.out.println("Ezin da zati 0 egin");
            }
            else {
                System.out.println("Sartu duzun aukera ez da egokia.");
            }

    }
}
