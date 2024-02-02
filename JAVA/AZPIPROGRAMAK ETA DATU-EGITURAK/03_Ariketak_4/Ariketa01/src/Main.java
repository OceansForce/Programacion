import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrizea = new int[5][5];
        sc.close();

        for (int i=0; i<5; i++ ){
            for (int j=0; j<5; j++){
                matrizea[i][j]=i+j;
            }
        }

        System.out.println("Hau da bukaerako matrizea:");
        for (int i=0; i<5;i++ ){
            for (int j=0; j<5; j++){
                System.out.print(matrizea[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}