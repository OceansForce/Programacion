import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       File f1 = new File(".\\fitx1.txt");

        System.out.println("Lerro kantitatea?");
        BufferedReader bf1 =new BufferedReader(new InputStreamReader(System.in));
        int kant= Integer.parseInt(bf1.readLine());

        System.out.println("Sartu karaktere-kateak:");
        BufferedReader bf2 =new BufferedReader(new InputStreamReader(System.in));
        Writer fw = new FileWriter(".\\fitx1.txt");
        int lerroak=0;
        while (kant>=lerroak){
            lerroak++;
            fw.write(String.valueOf(bf2));
        }
    }
}