import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int b=0;
        int p=0;
        int [] matrizea1 = new int [10];
        int [] matrizea2 = new int [10];
        int [] matrizea3 = new int [20];

        System.out.println("Bete array bat goraka ordenatutako 10 zenbaki osoekin");
        for (int i=0; i<10; i++){
            matrizea1[i] = sc.nextInt();
        }

        System.out.println("Bete beste array bat goraka ordenatutako 10 zenbaki osoekin");
        for (int a=0; a<10; a++){
            matrizea2[a] = sc.nextInt();
        }

        sc.close();

        for (int k=0; k<matrizea3.length; k++) {
            if (matrizea1[c] <= matrizea2[b]) {
                matrizea3[p] = matrizea1[c];
                c++;
                p++;

                if (c==matrizea1.length){
                    k = matrizea3.length;
                }
            }

            else if (matrizea1[c] > matrizea2[b]) {
                matrizea3[p] = matrizea2[b];
                b++;
                p++;

                if (b==matrizea2.length){
                    k = matrizea3.length;
                }
            }

        }

        System.out.println(p);

        if ((c==matrizea1.length || b==matrizea2.length) && p<matrizea3.length) {

            if (c==matrizea1.length){
                for (int m = b; m < matrizea1.length; m++) {
                    matrizea3[p] = matrizea2[m];
                    p++;
                }
            }
            else {
                for (int n = c; n < matrizea2.length; n++) {
                    matrizea3[p] = matrizea1[n];
                    p++;
                }
            }
        }

        for (int g=0; g<matrizea3.length; g++){
            System.out.print(matrizea3[g]);

            if (g<matrizea3.length-1){
                System.out.print(" - ");
            }
        }
    }
}