package torneo;

import surf.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Torneo {

    private String izena;
    private ArrayList<Surflari> surflariak;
    private Babesle[] babesleak;

    public Torneo(String izena, Babesle[] babesleak) {
        this.izena = izena;
        this.surflariak = new ArrayList<>();
        this.babesleak = babesleak;
    }

    void gehituSurflaria(Surflari surflaria){
        try {
            if(surflaria.getRankingPos()>20 || surflaria.getRankingPos()==0) {
                throw new SalbuespenPertsonalizatua("Ez dago top 20");
            }else {
                surflariak.add(surflaria);
            }

        }catch (SalbuespenPertsonalizatua e){
            System.err.println(e);
        }
    }

    void gordeFitxategian (){
        try {
           BufferedWriter bw1= new BufferedWriter(new FileWriter(".\\fitxategiak\\surflariak.bin",true));
            for (Surflari s: surflariak) {
                bw1.write(String.valueOf(s));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    ArrayList<Surflari> surflariakBabeslearekin (Babesle b1){
        ArrayList<Surflari> babesleak= new ArrayList<>();
        for (Surflari s: surflariak) {
            if (b1.equals(s.getBabestea())) {
                babesleak.add(s);
            }
        }
        return babesleak;
    }
    ArrayList<Surflari> surflariakTorneokoBabeslearekin (){
        ArrayList<Surflari> surflaria= new ArrayList<>();
        for (int i=0; i<babesleak.length-1; i++){
           for (Surflari s: surflariak) {
               if (babesleak[i].equals(s.getBabestea())){
                   surflaria.add(s);
               }
           }
        }
       return surflaria;
    }

    void igoTorneoKategoria(){
        for (Surflari s: surflariak) {
            if (s.getRankingPos()>15){
                surflariak.remove(s);
            }
        }
    }
}
