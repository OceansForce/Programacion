import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Sartu gygabyte kopura:");
        float gyga = sc.nextFloat();
        float mg = 0;
        float cd = 0;

        sc.close();




        mg = gyga*1024;
        cd = mg / 700;
        double cd1 = Math.ceil(cd);

        System.out.println(gyga+" GB gordetzeko "+cd1+" CD behar dira");
    }
}