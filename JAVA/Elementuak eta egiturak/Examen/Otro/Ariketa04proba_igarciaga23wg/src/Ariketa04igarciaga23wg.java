import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Sartu zenbaki bat");
        int zenb= sc.nextInt();
        int bb= 0;
        int max=0;
        int i =0;
        if (zenb == 0)
        {
           System.out.println("Asmatu duzu");
        }
        else
        System.out.println("1. Kalkulatu batezbestekoa");
        System.out.println("2. Kalkulatu maximoa");
        System.out.println("Sartu zenbaki bat");
        while (zenb !=0)
         {
            if (zenb==1)
            {
                while (i>zenb)
                {
                System.out.println("Zenbat zenbaki nahi dituzu?");
                i= sc.nextInt();
                zenb= sc.nextInt();
                bb= zenb/i;
                }
            if (zenb==2)
                {
                while (i>zenb)
                    {
                    System.out.println("Zenbat zenbaki nahi dituzu?");
                    i= sc.nextInt();
                    zenb= sc.nextInt();
                    max= zenb/i;
                    }
            }

        }

    }
    }
}