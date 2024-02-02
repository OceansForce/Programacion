import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ikasgai1 = 0;
        int ikasgai2 = 0;
        int ikasgai3 = 0;
        int ikasgai4 = 0;
        int ikasgai5 = 0;


        for(int i = 0; i < 10; i++) {

            System.out.println("Jarri "+i+" ikaslearen kodea:");
            int ik_kodea = sc.nextInt();

            System.out.println("Jarri "+i+" ikaslearen5 ikasgaietako notak");
             ikasgai1 = sc.nextInt();
             ikasgai2 = sc.nextInt();
             ikasgai3 = sc.nextInt();
             ikasgai4 = sc.nextInt();
             ikasgai5 = sc.nextInt();

             int min = Integer.MIN_VALUE;
             int max = Integer.MAX_VALUE;

             for (int j = 1; j <=5;j++){

             }

        }

    }
        System.out.println(ikasgai1+" "+ikasgai2+" "+ikasgai3+" "+ikasgai4+" "+ikasgai5);

    }
}