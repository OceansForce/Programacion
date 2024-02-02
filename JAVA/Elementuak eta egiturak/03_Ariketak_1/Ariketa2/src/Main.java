import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu hitz bat:");
        String hitza1 = sc.nextLine();

        System.out.println("Sartu beste hitz bat:");
        String hitza2 = sc.nextLine();

        System.out.println("Sartu azken hitza bat");
        String hitza3 = sc.nextLine();
        sc.close();

        int hitz1 = hitza1.length();
        int hitz2 = hitza2.length();
        int hitz3 = hitza3.length();
        int karak = hitz1+hitz2+hitz3;

        System.out.println(hitza1+hitza2+hitza3+". "+karak+"karaktere luzera dauka");
        }
    }
