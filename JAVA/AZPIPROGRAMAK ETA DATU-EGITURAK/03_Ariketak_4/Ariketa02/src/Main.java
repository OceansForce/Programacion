import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrizea = new int[4][4];
        int c=0;
        System.out.println("Bete 4x4ko matrize bat zenbaki osoekin:");
        for (int i = 0; i < matrizea.length; i++) {
            for (int j = 0; j < matrizea.length; j++) {
                matrizea[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Hau da bukaerako matrizea:");
        for (int i=0; i<matrizea.length;i++ ){
            for (int j=0; j<matrizea.length; j++){
                System.out.print(matrizea[i][j]+"\t");
            }
            System.out.print("\n");
        }

        for (int a = 0; a < matrizea.length; a++) {
            for (int b = 0; b < matrizea.length; b++) {
                if (matrizea[a][b]== matrizea[b][a]){
                    c++;
                }
            }
        }

        if(c==16){
            System.out.println("Matrizea simetrikoa da.");
        }

        else {
            System.out.println("Matrizea ez da simetrikoa.");
        }
    }
}