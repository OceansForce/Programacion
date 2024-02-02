import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float batsplus=0;
        float batsminus=0;
        float zenb0= 0;
        float zenbplus=0;
        float zenbminus=0;

        System.out.println("Sartu hamar zenbaki oso:");

        int[] zenb= new int [10];

        for (int i=0; i<10; i++){
            int zenb1 = sc.nextInt();
            zenb[i]= zenb1;
        }
        for (int z=0; z<10; z++){
            if (0<zenb[z]){
                zenbplus= zenbplus+1;
                batsplus= batsplus+zenb[z];
            }
            else if (0>zenb[z]){
                zenbminus=zenbminus+1;
                batsminus= batsminus+zenb[z];
            }
            else if (0==zenb[z]){
               zenb0=zenb0+1;
            }
        }

        System.out.println("Zenbaki positiboen batezbestekoa: "+batsplus/zenbplus);
        System.out.println("Zenbaki negatiboen batezbestekoa: "+batsminus/zenbminus);
        System.out.println("Zero izandako zenbakien kopurua "+zenb0);
    }
}