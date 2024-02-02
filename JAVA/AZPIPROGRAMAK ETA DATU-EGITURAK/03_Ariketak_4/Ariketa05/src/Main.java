import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();

        System.out.println("Sartu matrizearen errenkada kopurua:");
        int zenb1 = sc.nextInt();
        System.out.println("Sartu matrizearen zutabe kopurua:");
        int zenb2 = sc.nextInt();

        int [][] matrizea1 = new int[zenb1][zenb2];
        int [][] matrizea2 = new int[zenb2][zenb1];


        for (int i = 0; i < zenb1; i++) {
            for (int j = 0; j < zenb2; j++) {
                int zenb = random.nextInt(15);
                matrizea1[i][j] = zenb;
            }
        }

        for (int i = 0; i < zenb2; i++) {
            for (int j = 0; j < zenb1; j++) {
                matrizea2[i][j] = matrizea1[j][i];
            }
        }
        sc.close();

        System.out.println("Hau sarrerako matrizea:");
        for (int i=0; i< zenb1;i++ ){
            for (int j=0; j< zenb2; j++){
                System.out.print(matrizea1[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Hau da emaitza matrizea:");
        for (int i=0; i< zenb2;i++ ){
            for (int j=0; j< zenb1; j++){
                System.out.print(matrizea2[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }
}