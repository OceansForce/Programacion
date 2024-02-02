import java.util.Scanner;
public class JulenGarciaMata_Ariketa7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        boolean bukatu=true;


        int array1[]= new int[7];
        int array2[]= new int[7];

        while (bukatu){
        array1[0]= 4;
        array1[1]= 1;
        array1[2]= 3;
        array1[3]= 9;
        array1[4]= -10;
        array1[5]= 15;

        System.out.println("Aukeratu eragiketa bat:");
        System.out.println("1. Gehitu elementua");
        System.out.println("2. Bi elementu handienak");
        System.out.println("3. Balio bikoitien array-a");
        System.out.println("4. Bukatu");
        int aukera= sc.nextInt();


        switch (aukera){

            case 1:
                System.out.println("Sartu gehitu nahi duzun zenbakia:");
                int zenb1= sc.nextInt();

                System.out.println("Sartu zein posiziotan gehitu nahi duzun:");
                int pop1= sc.nextInt();

                gehitu(array1,pop1,zenb1);
                break;
            case 2:
                handienak(array1);
                break;
            case 3:
                System.out.println("****************");
                System.out.println("Bikoitien array-a:");
                bikoitiak(array1,array2);
                System.out.println("****************");
                System.out.println("");
                break;
            case 4:
                bukatu=false;
            }
        }
        sc.close();
    }

    public static void gehitu(int array1[], int posizioa, int zenbakia){


        for (int a=array1.length-1 ; a>=posizioa; a--) {
            array1[a]=array1[a-1];
        }
        array1[posizioa] = zenbakia;
        System.out.println("****************");
        System.out.println("Array berria:");
        for (int b=0; b<array1.length; b++){
            System.out.print(array1[b]+" ");
        }
        System.out.println("");
        System.out.println("****************");
    }

    public static void handienak(int array[]){
        int max1=0;
        int max2=0;
        for (int c=0; c<array.length-1; c++){

            if (max1<array[c]){
                max1=array[c];
            }
        }
        for (int c=0; c<array.length-1; c++){

            if (max2<array[c] && array[c]!=max1){
                max2=array[c];
            }
        }
        System.out.println("****************");
        System.out.println("Zenbaki handiena: "+max1);
        System.out.println("Bigarren zenbaki handiena: "+max2);
        System.out.println("****************");
    }

    public static void bikoitiak(int array1[], int array2[]){
        int zenb1=0;
        for (int i=0; i<array1.length; i++){
            if ((array1[i]%2)==0){
                array2[zenb1]=array1[i];
                zenb1++;
            }
        }
        for (int a=0; a<zenb1; a++){
            System.out.print(array2[a]+" ");
        }

    }
}
