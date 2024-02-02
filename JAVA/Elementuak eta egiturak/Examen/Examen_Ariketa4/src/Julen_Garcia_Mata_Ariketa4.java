import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int zenb1=0;
        int zenbbatu=0;
        int max= 0;

        System.out.println("Idatzi zenbaki oso bat");
        zenb1 = sc.nextInt();

        while (zenb1!=0 || zenb1<=1){

            switch (zenb1){
                case 1 :
                    System.out.println("Zenbat zenbaki nahi dituzu sartu?");
                    int kanti = sc.nextInt();

                    System.out.println("Zein zenbaki izango dira?");
                    for (int i=0; i<kanti; i++){

                        int zenb2 = sc.nextInt();

                        zenbbatu= zenbbatu+zenb2;
                    }

                    double batez =zenbbatu/kanti;
                    System.out.println(batez+" da batezbestekoa");
                    System.out.println("Idatzi zenbaki oso bat");
                    zenb1 = sc.nextInt();


                case 2 :
                    System.out.println("Zenbat zenbaki nahi dituzu sartu?");
                    int kanti2 = sc.nextInt();

                    System.out.println("Zein zenbaki izango dira?");
                    for (int a=0; a<kanti2; a++){
                        int zenb3 = sc.nextInt();

                        if (max<zenb3){
                            max=zenb3;
                        }
                    }
                    System.out.println(max+" da zenbaki handiena");
                    System.out.println("Idatzi zenbaki oso bat");
                    zenb1 = sc.nextInt();
            }
        }
        sc.close();
    }
}