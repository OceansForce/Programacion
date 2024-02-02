import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        int[] zenbakiak= new int[100];
        for (int i=0; i<100; i++){
            zenbakiak[i]=i+1;
        }
        for (int a=0; a<100; a++){
            sum= sum+zenbakiak[a];
        }
        float sumb=sum;
        float batez= sumb/100;
        System.out.printf("Elementu guztien batura "+sum+" da eta batezbestekoa "+batez+" da.");

    }
}