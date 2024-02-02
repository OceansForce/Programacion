import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat: ");
        int zenb1 = sc.nextInt();
        System.out.println("Sartu beste zenbaki bat: ");
        int zenb2 = sc.nextInt();
        int bat = zenb1/zenb2;
        System.out.println(bat);
        sc.close();
    }
}