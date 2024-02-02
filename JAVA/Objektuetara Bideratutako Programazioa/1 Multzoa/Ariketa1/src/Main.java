import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        class Produktua{
            String Izena;
            float prezio;
            int kopuru;
            void erakutsiProduktua (){
                System.out.println(Izena+" - "+prezio+"€ - "+ kopuru);
            }
        }
    }
}