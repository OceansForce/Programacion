import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1= new int[10];
        int[] array2= new int[10];
        System.out.println("Bete array bat 10 zenbaki osoekin:");

        for (int a=0; a< array1.length; a++){
            int zenb1= sc.nextInt();
            array1[a]=zenb1;
        }

        sc.close();

        System.out.println("Hau da bukaerako array-a");

        for (int b=0; b< array1.length; b++){
            if (array1[b]==0){
                array2[b]=array1[b];

            }
        }

    }
}