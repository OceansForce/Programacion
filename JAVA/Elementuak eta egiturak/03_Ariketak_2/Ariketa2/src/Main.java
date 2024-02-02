import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int ikasgaikop = 0;
        float prak = 0;
        float teor = 0;
        int ikaskop = 0;

        float Pnthan = 0;
        String sexuAltuena= "";

        float batazHd= 0;
        float batazHd2= batazHd;

        float prak2 = 0;
        float teor2 = 0;
        int ikaskop2 = 0;

       for (int i =0; i<5; i++){
           System.out.println("Sartu "+i+" ikasgailaren kodea");
           int kodea  = sc.nextInt();
           System.out.println("Sartu "+kodea+" ikasgailaren hordu kopurua");
           int hordu = sc.nextInt();

           System.out.println("Sartu "+kodea+" ikasgailaren ikasle kopurua");
           ikaskop = sc.nextInt();

           batazHd = batazHd+ hordu;
           batazHd2= batazHd2*5;

               for (int k=0; k<=ikaskop ; k++){

                   System.out.println("Zein da "+k+" ikaslearen sexua (E,G edo Z)");
                   String Sx = sc.nextLine();


                   System.out.println(k+"ikaslearen nota teorikoa eta praktikoa");
                   Float notaT = sc.nextFloat();
                   Float notaP = sc.nextFloat();

                   if (hordu>8){
                       ikasgaikop = ikasgaikop +1;
                       prak= prak+notaP;
                       teor= teor+notaT;
                   }

                   if (notaP>Pnthan){
                       Pnthan = notaP;
                       sexuAltuena = Sx;
                   }

                   if (hordu>=5 && hordu>=15){
                       ikasgaikop = ikasgaikop +1;
                       prak2= prak2+notaP;
                       teor2= teor2+notaT;
                   }
               }
               System.out.println("Nota altuenaren sexua ");
       }

       float batazP = prak * ikaskop;
       float batazT = teor * ikaskop;
       System.out.println("");

       System.out.println("Hordu batezbesteko: "+batazHd2);

       float batazP2 = prak2 * ikaskop;
       float batazT2 = teor2 * ikaskop;
       System.out.println();

    }
}