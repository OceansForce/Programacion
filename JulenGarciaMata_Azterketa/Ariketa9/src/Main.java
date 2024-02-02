import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g1=0;
        int falta=0;
        int zenbat=0;

        System.out.println("Adierazi lehen zenbaki osoaren digitu kopurua:");
        int zenb = sc.nextInt();

        int[] digitu1= new int [zenb];
        System.out.println("Sartu lehen zenbakia digituz digitu:");

        for (int i=0; i<zenb;i++){
            int zenb1=sc.nextInt();
            digitu1[i]=zenb1;
        }

        System.out.println("Adierazi bigarren zenbaki osoaren digitu kopurua:");
        int zenb2 = sc.nextInt();

        if (zenb2<zenb){
            falta=zenb-zenb2;
            g1=falta;
            zenb2=zenb2+falta;
        }

        int[] digitu2= new int [zenb2];
        System.out.println("Sartu bigarren zenbakia digituz digitu:");

        for (int g=g1; g<zenb2;g++){
            int zenb3=sc.nextInt();
            digitu2[g]=zenb3;
        }

        sc.close();



        System.out.println("Sartutako zenbakiak:");
        for (int a=0; a<zenb;a++){
            System.out.print(digitu1[a]);
        }
        System.out.print("\n");

        for (int a=0; a<zenb2;a++){
            System.out.print(digitu2[a]);
        }
        System.out.print("\n");

        for (int w=zenb-1; w>=0;w--){
            if ((digitu1[w]+digitu2[w])>=10){
                zenbat++;
                digitu1[w]=digitu1[w]+1;
            }

        }
        System.out.println("Batuketan "+zenbat+" eramaten d(ir)a.");

    }
}