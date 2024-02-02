import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] zenb1= new int [5];
       int[] zenb2= new int [5];
       int b= zenb2.length-1;

       System.out.println("Sartu 5 zenbaki oso:");
       for (int a=0 ; a<zenb1.length; a++){
           int  zenb = sc.nextInt();
           zenb1[a]=zenb;
       }

       sc.close();

        for (int c=0; c<zenb2.length; c++){
            zenb2[b] = zenb1[c];
            b--;
        }

        System.out.println("Bukatu array-a:");

        for (int i : zenb2) {
            System.out.print(i);
            System.out.print("\t");
        }

       }
    }
