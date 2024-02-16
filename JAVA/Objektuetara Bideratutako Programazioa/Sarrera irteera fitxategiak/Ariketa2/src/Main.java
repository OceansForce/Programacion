import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        File f1 = new File(".\\Ariketa2_fitx1.txt");
        File f2 = new File(".\\Ariketa2_fitx2.txt");
        File f3 = new File(".\\Ariketa2_fitx3.txt");

        FileWriter fileWriter = new FileWriter(".\\Ariketa2_fitx1.txt", true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }

        bw.close();
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