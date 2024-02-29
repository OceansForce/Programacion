import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        File f1 = new File(".\\Ariketa2_fitx1.txt");
        File f2 = new File(".\\Ariketa2_fitx2.txt");
        File f3 = new File(".\\Ariketa2_fitx3.txt");


        BufferedWriter bw1 = new BufferedWriter(new FileWriter(f2));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(f3));
        BufferedReader br= new BufferedReader(new FileReader(f1));
        bw1.write(br.readLine());
        char[] array= new char[br.read()];
        bw2.write( br.read(array, 0, 5));

        bw1.close();
       try {
           BufferedReader fitx1 = new BufferedReader(new FileReader(".\\Ariketa2_fitx1.txt"));

       }catch (IOException e){
           System.err.println("Fitxategia ez da existitzen");
       }

        /*System.out.println("2 fitxategiaren izena");
        String fitx2= sc.next();
        System.out.println("3 fitxategiaren izena");
        String fitx3= sc.next();*/

    }
}