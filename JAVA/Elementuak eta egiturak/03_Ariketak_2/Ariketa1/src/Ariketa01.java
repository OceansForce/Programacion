import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float ikasgaiBB = 0;
        int notaBaxuena = 11;
        int ikBaxuena = -1;
        int ikasle8 = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Sartu ikaslearen kodea:");
            int kode = sc.nextInt();
            int altuena = -1;
            int baxuena = 11;
            boolean aurkitua = false;
            for (int j = 1; j <= 5; j++)
            {
                System.out.println("Sartu " + j + ". ikasgaian izandako nota:");
                int nota = sc.nextInt();
                if (nota > altuena)
                {
                    altuena = nota;
                }
                if (nota < baxuena)
                {
                    baxuena = nota;
                }
                if (j == 1)
                {
                    ikasgaiBB = ikasgaiBB + nota;
                }
                if (nota > 8 && !aurkitua)
                {
                    ikasle8++;
                    aurkitua = true;
                }
                if (nota < notaBaxuena)
                {
                    notaBaxuena = nota;
                    ikBaxuena = kode;
                }
            }
            System.out.println(kode + " kodea duen ikaslearen nota baxuena: " + baxuena);
            System.out.println(kode + " kodea duen ikaslearen nota altuena: " + altuena);
        }
        sc.close();
        System.out.println("1. ikasgaiaren batezbesteko nota: " + ikasgaiBB / 10);
        System.out.println("Ikasgairen batean 8 baino nota altuagoa izandako ikasleen kopurua: " + ikasle8);
        System.out.println("Nota baxuena izandako ikaslearen kodea: " + ikBaxuena);
    }
}