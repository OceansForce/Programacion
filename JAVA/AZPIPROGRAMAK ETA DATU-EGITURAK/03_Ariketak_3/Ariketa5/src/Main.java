import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bete arry bat 10 zenbaki osoekin");
        int[] zenb = new int[10];
        int d= 0;
        int r= 0;
        int b= 0;

        for (int i=0; i<10; i++){
            int zenb1 = sc.nextInt();
            zenb[i]= zenb1;

        }
        sc.close();

        for (int a=0; a<10-1; a++){
            if(zenb[a]<=zenb[a+1] && zenb[a]!=zenb[9] ){
                r++;

            }
            if(zenb[a]>=zenb[a+1] && zenb[a]!=zenb[9]){
               d++;

            }
            if(zenb[a]==zenb[9]){
                b++;

            }
        }

        if (r==9){
            System.out.println("Array-a goraka ordenatuta dago");
        }
        else if (d==9) {
            System.out.println("Array-a beheraka ordenatuta dago");
        }
        else if (b==9){
            System.out.println("Zenbaki guztiak berdinak dira, ezin da esan ordenaturik dagoen.");
        }
        else {
            System.out.println("Array-a desordenatuta dago dago");
        }

    }
}