import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] kalif= new String[4] [];
        kalif[0]= new String[]{"D","D","D","D","D"};
        kalif[1]= new String[]{"C","C"};
        kalif[2]= new String[]{"B","B"};
        kalif[3]= new String[]{"A","A"};

        //kalif = {{"D","D","D","D","D"},{"C","C"},{"B","B"},{"A","A"}};


        System.out.println("Sartu hamar ikasleen izenak:");
        String[] izena= new String[10];

        for (int i = 0; i <10; i++) {
            String ikas_izena= sc.nextLine();
            izena[i]=ikas_izena;
        }

        System.out.println("Sartu hamar nota (zenbaki hamartarrak)");
        float[] nota= new float[10];
        double[] ikas_not= new double[10];

        for (int a = 0; a <10; a++) {
            float ikas_nota= sc.nextFloat();
            nota[a]=ikas_nota;
            ikas_not[a]=ikas_nota;
        }

        for (int c=0; c<10; c++){
            int nota_boro = (int)Math.floor(ikas_not[c]);
            System.out.println("Ikaslea: "+izena[c]+"-"+"Nota:"+nota[c]+" Kalifikazioa: "+kalif[nota_boro]);
        }
    }
}