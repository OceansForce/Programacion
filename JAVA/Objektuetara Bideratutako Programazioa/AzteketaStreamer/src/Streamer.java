import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Streamer {

    private String izena;
    private int adina;
    private String jaiotza_data;
    private int harpidedunKOP;
    private String[] videojokoak;

    public Streamer(String izena, String jaiotza_data, String[] videojokoak) {

        this.izena = izena;
        this.jaiotza_data = jaiotza_data;
        String[] urte= jaiotza_data.split("/");
        this.adina = (2024-Integer.parseInt(urte[0]));
        this.harpidedunKOP = 0;
        this.videojokoak = videojokoak;
    }

    public Streamer(String izena, String jaiotza_data, int harpidedunKOP, String[] videojokoak) {
        this.izena = izena;
        this.jaiotza_data = jaiotza_data;
        this.harpidedunKOP = harpidedunKOP;
        this.videojokoak = videojokoak;
    }

    void gehituBideojokoak(String bideojokoa){
        for (int i=0; i< videojokoak.length; i++){
            if (videojokoak[i] != null){
                videojokoak[i]=bideojokoa;
            }
        }
    }

    @Override
    public String toString() {
        return "[" + izena + ", " + adina+", "+ jaiotza_data+", "+ harpidedunKOP+", "+Arrays.toString(videojokoak) +"]";
    }

    public String getIzena() {
        return izena;
    }

    public String[] getVideojokoak() {
        return videojokoak;
    }
}
