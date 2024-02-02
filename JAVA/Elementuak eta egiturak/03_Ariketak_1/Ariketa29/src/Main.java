import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zenb1=0;
        int zenb2=0;
        int zenb3=0;
        int zenb4=0;
        int zenb5=0;
        int zenb6=0;
        int zenb7=0;
        int zenb8=0;
        int zenb9=0;
        int zenb10=0;
        int zenb11=0;
        int zenb12=0;

        int piztuta= 0;
        int aldatu= 0;
        int beteta=0;

        while (piztuta==0) {

            if (zenb12<100) {
                System.out.println("Sartu zenbaki oso bat");
                zenb1 = sc.nextInt();
                zenb2 = zenb1;
                aldatu= aldatu+1;

                zenb12= zenb11+zenb2+zenb3+zenb4+zenb5+zenb6+zenb7+zenb8+zenb9+zenb10;

                if (aldatu==1){
                     zenb3 = zenb1;
                }

                else if (aldatu==2){
                     zenb4 = zenb1;
                }

                else if (aldatu==3){
                    zenb5 = zenb1;
                }

                else if (aldatu==4){
                    zenb6 = zenb1;
                }

                else if (aldatu==5){
                    zenb7 = zenb1;
                }

                else if (aldatu==6){
                    zenb8 = zenb1;
                }

                else if (aldatu==7){
                    zenb9 = zenb1;
                }

                else if (aldatu==8){
                    zenb10 = zenb1;
                }

                else if (aldatu==9){
                    zenb11 = zenb1;
                    beteta = 1;
                }
                else if (beteta==1) {
                    System.out.println(zenb2+" "+"+"+" "+zenb3+" "+"+"+" "+zenb4+" "+"+"+" "+zenb5+" "+"+"+" "+zenb6+" "+"+"+" "+zenb7+" "+"+"+" "+zenb8+" "+"+"+" "+zenb9+" "+"+"+" "+zenb10+" "+"+"+" "+zenb11+" "+"+"+" "+"="+" "+zenb12);
                }
            }

            else if (zenb12>100){
                piztuta=1;
                System.out.println("Exekuzioa amaitu da, sartutako zenbakien batura 100en berdina edo handiagoa da.");
                System.out.println(zenb2+" "+"+"+" "+zenb3+" "+"+"+" "+zenb4+" "+"+"+" "+zenb5+" "+"+"+" "+zenb6+" "+"+"+" "+zenb7+" "+"+"+" "+zenb8+" "+"+"+" "+zenb9+" "+"+"+" "+zenb10+" "+"+"+" "+zenb11+" "+"+"+" "+"="+" "+zenb12);}}sc.close();
    }
}