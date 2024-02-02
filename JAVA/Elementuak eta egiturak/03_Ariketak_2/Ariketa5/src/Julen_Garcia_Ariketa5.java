import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float totafasold = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Jarri " + i + " probintziaren kodea:");
            int kode1 = sc.nextInt();

            System.out.println("Jarri " + i + " probintziaren herri kopurua:");
            int herri1 = sc.nextInt();

            for (int a = 1; a <= herri1; a++) {
                totafasold = 0;
                System.out.println("Jarri " + a + " herriaren kodea:");
                int herkode1 = sc.nextInt();

                System.out.println("Jarri " + a + " herriaren azalera:");
                float azalera = sc.nextFloat();

                System.out.println(a + " herriaren familia kopurua");
                int fakop = sc.nextInt();

                for (int c = 1; c <= fakop; c++) {
                    System.out.println("Jarri " + c + " familiare kodea:");
                    int fakod = sc.nextInt();

                    System.out.println("Jarri " + c + " familiaren soldata");
                    float fasold = sc.nextFloat();

                    System.out.println("Jarri " + c + " familiaren seme-alaba kopurua");
                    int semekop = sc.nextInt();

                    totafasold = totafasold + fasold;

                }
                float batasbest = totafasold/herri1;
                System.out.println(batasbest);
            }

        }
        sc.close();
    }
}
