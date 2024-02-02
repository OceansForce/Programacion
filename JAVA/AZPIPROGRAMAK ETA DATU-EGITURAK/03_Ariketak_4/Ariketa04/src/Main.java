import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int [][] matrizea1 = new int[3][3];
        int [][] matrizea2 = new int[3][3];


        for (int i = 0; i < matrizea1.length; i++) {
            for (int j = 0; j < matrizea1.length; j++) {
                int zenb = random.nextInt(15);
                matrizea1[i][j] = zenb;
            }
        }

        for (int i = 0; i < matrizea2.length; i++) {
            for (int j = 0; j < matrizea2.length; j++) {
                matrizea2[i][j] = matrizea1[j][i];
            }
        }
        sc.close();

        System.out.println("Hau sarrerako matrizea:");
        for (int i=0; i<matrizea1.length;i++ ){
            for (int j=0; j<matrizea1.length; j++){
                System.out.print(matrizea1[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Hau da emaitza matrizea:");
        for (int i=0; i<matrizea2.length;i++ ){
            for (int j=0; j<matrizea2.length; j++){
                System.out.print(matrizea2[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }
}