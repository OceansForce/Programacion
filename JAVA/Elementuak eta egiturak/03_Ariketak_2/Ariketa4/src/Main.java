import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bukatu =0;

        while (bukatu==0){
            System.out.println("Sartu zenbaki hamartar bat");
            float berrekizuna = sc.nextFloat();

            System.out.println("Sartu zenbaki oso bat");
            int berretzailea = sc.nextInt();

            float zenb2=berrekizuna;
            for (int i=1; i<=berretzailea; i++){
                berrekizuna= berrekizuna*zenb2;
            }
            berrekizuna= berrekizuna/zenb2;
            System.out.println(berrekizuna);

            System.out.println("Jarraitu nahi duzu?(E edo G jarri)");
            String jarraitu = sc.nextLine();

            if (jarraitu == "G"){
                bukatu=1;
            }
        }
    }
}