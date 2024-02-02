import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu lau zifretako zembaki bat:");
        String zenb1 = sc.nextLine();

        sc.close();

        int zenbbat = zenb1.length();
        if (zenbbat == 4){
            char lehena = zenb1.charAt(0);
            String lehena2 = Character.toString(lehena);
            int lehena3 = Integer.parseInt(lehena2);

            char bigarrena = zenb1.charAt(1);
            String bigarrena2 = Character.toString(bigarrena);
            int bigarrena3 = Integer.parseInt(bigarrena2);

            char hirugarrena = zenb1.charAt(2);
            String hirugarrena2 = Character.toString(hirugarrena);
            int hirugarrena3 = Integer.parseInt(hirugarrena2);

            char lahugarrena = zenb1.charAt(3);
            String lahugarrena2 = Character.toString(lahugarrena);
            int lahugarrena3 = Integer.parseInt(lahugarrena2);

            int guztira = lehena3+bigarrena3+hirugarrena3+lahugarrena3;
            System.out.println(guztira);
        }
        else {
            System.out.println("Sartutako zenbakiak ez ditu lau zifra");
        }


    }
}