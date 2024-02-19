import java.io.*;

public class AgendaKudeatzailea {
    private String Fitx_izena;

    public AgendaKudeatzailea(String fitx_izena) {
        Fitx_izena = fitx_izena;
    }

    void erakutsi() {
        try {

            BufferedReader br = new BufferedReader(new FileReader(".\\" + Fitx_izena + ".txt"));
            String textua = br.readLine();
            while (textua != null) {
                System.out.println(textua);
                textua = br.readLine();
            }
            br.close();
        }catch (IOException e){
            System.err.println("Ezin da irakurri");
        }

    }
    void gehitupertsona(Pertsona per) throws IOException {
        try {
            BufferedWriter fw1 = new BufferedWriter(new FileWriter(".\\" + Fitx_izena + ".txt", true));
            fw1.write(String.valueOf(per));
            fw1.close();
        }catch (IOException e){
            System.err.println("Ezin da gehitu pertsona");
        }
    }

    String pertsonaBilatu(String pertsona) throws IOException {
        try {

            FileReader fr = new FileReader(".\\" + Fitx_izena + ".txt");
            BufferedReader bw = new BufferedReader(fr);
            String textua = bw.readLine();

            while (textua != null) {
                String[] arraya = textua.split("\t");

                if (arraya[0].equals("izena=" + pertsona)) {
                    return textua;
                }
                textua = bw.readLine();
            }
            bw.close();
            fr.close();
        }catch (IOException e){
            System.err.println("Ezin da irakurri fitxategia");
        }
        return null;
    }
}
