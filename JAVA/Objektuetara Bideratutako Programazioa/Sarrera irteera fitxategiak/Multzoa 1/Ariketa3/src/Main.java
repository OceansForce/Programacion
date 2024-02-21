import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       try {

           File f1 = new File(".\\fitx1.txt");

           System.out.println("Lerro kantitatea?");
           BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
           int kant = Integer.parseInt(bf1.readLine());


           FileWriter fw = new FileWriter(".\\fitx1.txt");
           BufferedWriter bw = new BufferedWriter(fw);


           System.out.println("Sartu karaktere-kateak:");
           for (int i = 0; i < kant; i++) {
               String karak_katea = String.valueOf(bf1.readLine());
               char[] bai = karak_katea.toCharArray();

               for (int a = bai.length - 1; a >= 0; a--) {
                   if (a <= 29) {
                       bw.write(bai[a]);
                   }
               }
               bw.newLine();
           }

           bf1.close();
           bw.close();
       }catch (IOException e){
           System.err.println("Errorea");
       }

    }
}