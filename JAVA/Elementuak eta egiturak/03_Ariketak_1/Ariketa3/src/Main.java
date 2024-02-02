import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu segundu kopuru bat:");
        int zenb1 = sc.nextInt();
        sc.close();

        int egun= ((zenb1/60)/60)/24 ;
        int hord = (((zenb1/60)/60)%24);
        int minut = (zenb1/60)%60;
        int sec = zenb1%60;

        System.out.println(zenb1+" segundu "+egun+" egun, "+hord+" hordu, "+minut+" minutu eta "+sec+" segundu dira.");
    }
}
