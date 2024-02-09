import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Zenbat zenbaki:");
       BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
       int x= Integer.parseInt(bf1.readLine());
        System.out.println("Sartu zenbakiak:");
        BufferedWriter bw = new BufferedWriter(new FileWriter("zenb.bin"));

        for (int i=0; i<x; i++){
            int  sarrera =  Integer.parseInt(bf1.readLine());
            bw.write(sarrera);
        }
        bw.close();

        BufferedReader bf2 = new BufferedReader(new FileReader(".\\zenb.bin"));
        bw = new BufferedWriter(new FileWriter(".\\zenb.bin"));

        String lerro = bf2.readLine();
        while (lerro != null){

            int zenb= Integer.parseInt(lerro);
            bw.write(zenb);
            bw.newLine();
        }
    }
}