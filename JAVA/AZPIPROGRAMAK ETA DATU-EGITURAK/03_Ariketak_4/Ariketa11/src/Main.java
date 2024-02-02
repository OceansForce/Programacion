import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean aktibatu= true;
        int a=0;
        int c=0;
        String[] izenak= new String[10];
        float [] [] datuak=  new float[10][3];
        float[] handiena=  new float[10];


        while (aktibatu) {
            System.out.println("Aukeratu aukera bat:");
            System.out.println("1. Partaide bat erregistratu");
            System.out.println("2. Datuak erakutsi");
            System.out.println("3. Marka onenak ikusi");
            System.out.println("4. Bukatu programa");
            int aukeratu= sc.nextInt();

            switch (aukeratu) {
                case 1:
                    c++;
                    System.out.println("Sartu partaidearen izena");
                    izenak[a] =sc.next();
                    System.out.println("Sartu partaidearen 2020ko marka");
                    datuak[a][0]=sc.nextFloat();
                    System.out.println("Sartu partaidearen 2021ko marka");
                    datuak[a][1]=sc.nextFloat();
                    System.out.println("Sartu partaidearen 2022ko marka");
                    datuak[a][2]=sc.nextFloat();
                    a++;
                    break;
                case 2:
                    System.out.println("********* Datu guztiak *********");
                    for (int b=0; b<a; b++){
                        System.out.println("Partaidea: "+ izenak[b]);
                        System.out.println("\t"+"2020ko marka: "+ datuak[b][0]);
                        System.out.println("\t"+"2021ko marka: "+ datuak[b][1]);
                        System.out.println("\t"+"2022ko marka: "+ datuak[b][2]);
                    }
                    System.out.println("********************************");
                    break;
                case 3:
                    System.out.println("********* Datu guztiak *********");
                    for (int d=0; d<c; d++) {
                        for (int e = 0; e < 3; e++) {
                            if (datuak[d][e] > handiena[d]) {
                                handiena[d] = datuak[d][e];
                            }
                        }
                        System.out.println(izenak[d] + " - " + handiena[d]);
                    }
                    System.out.println("********************************");
                    break;
                case 4:
                    aktibatu = false;
                    break;
            }
        }
    }
}