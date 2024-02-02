import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Sartu matrizearen errenkada kopurua:");
        int errenkadak= sc.nextInt();

        System.out.println("Sartu matrizearen zutabe kopurua:");
        int zutabe= sc.nextInt();

        int[][] matrizea= new int[errenkadak][zutabe];

        System.out.println("Hau da emaitza matrizea:");

        for (int a=0; a<errenkadak;a++){
            for (int b=0; b<zutabe; b++){
                if (a==0 || a==errenkadak-1 ||b==0 || b==zutabe-1){
                    matrizea[a][b]=1;
                }
                System.out.print(matrizea[a][b]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}