import java.io.*;

public class AgendaKudeatzailea {
    private String Fitx_izena;

    public AgendaKudeatzailea(String fitx_izena) {
        Fitx_izena = fitx_izena;
    }

    void erakutsi() throws IOException {

        BufferedReader br= new BufferedReader(new FileReader(".\\"+Fitx_izena));
        String textua= br.readLine();
        while ()

    }
    void gehitupertsona(Pertsona per) throws IOException {
       FileWriter fw1= new FileWriter(".\\"+Fitx_izena);
       fw1.write(String.valueOf(per));
    }
}
