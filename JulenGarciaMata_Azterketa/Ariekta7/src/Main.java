import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean egia= false;
        System.out.println("Zenbat errenkada");
        int errenkada= sc.nextInt();

        int luzera=errenkada-1;

        int[][] array= new int[errenkada][errenkada];

        System.out.println("sartu matrizearen edukia:");
        for (int i=0; i<errenkada;i++){
            for (int a=0; a<errenkada; a++){
                int edukia= sc.nextInt();
                array[i][a]=edukia;
            }
        }
        sc.close();
        System.out.println("Hau da adierazitako matrizea:");
        for (int b=0; b<errenkada;b++){
            for (int c=0; c<errenkada;c++){
                System.out.print(array[b][c]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

       if ((array[luzera][luzera]==0) && (array[luzera][0]==0)){
           System.out.println("a");
           for (int g=1; g<luzera; g++){
               if ((array[luzera][g]==0) && (array[g][0]==0)){
                   egia=true;
               }
           }
       }

        else if ((array[0][0]==0) && (array[0][luzera]==0)){
            for (int g=1; g<luzera; g++){

                if ((array[luzera-g][luzera]==0) && (array[0][luzera-g]==0)){
                    egia=true;
                }
            }
        }

        if (egia){
            System.out.println("Matrizea triangularra da:");
        }

        else {
           System.out.println("Matrizea ez da triangularra.");
       }

    }
}