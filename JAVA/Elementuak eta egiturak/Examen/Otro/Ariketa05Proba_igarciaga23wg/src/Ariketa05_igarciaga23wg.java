import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Idatzi 25 eta 75 arteko bi zenbaki oso");
        int zenb1= sc.nextInt();
        int zenb2=sc.nextInt();
        if (zenb1<25 && zenb1>75){
            System.out.println("Errorea");

        }
        if (zenb2<25 && zenb2>75){
            System.out.println("Errorea");

        }

        }
    }
