package eskaerak;

import java.util.Arrays;

public class Mailegua{

    private Erabiltzailea []erabiltzaileLista;
    private int kokapena=0;
    public Mailegua(Erabiltzailea erabiltzailea){
        //super(NAN,izena);
        this.erabiltzaileLista= new Erabiltzailea[5];
        this.erabiltzaileLista[kokapena]=erabiltzailea;

        kokapena++;
    }

    public Object erakutsiMailegua(){

        return Arrays.toString(erabiltzaileLista);
    }


}
