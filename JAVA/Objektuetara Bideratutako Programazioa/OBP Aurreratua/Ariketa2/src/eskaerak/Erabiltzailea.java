package eskaerak;

public class Erabiltzailea  {

    private String NAN;
    private String izena;

    public Erabiltzailea(String NAN, String izena){
        this.NAN=NAN;
        this.izena=izena;

    }

    public void erakutsiErabiltzailea(){
        System.out.println("NAN= "+this.NAN);
        System.out.println("Izena= "+this.izena);
    }

    /*

    private String izena;

    private String nan;

    private Mailegua[] maileguak;

    private int mailegukop;

    public Erabiltzailea(String izena, String nan){
        this.nan=nan;
        this.izena=izena;
        this.maileguak= new Mailegua[5];
        this.mailegukop=0;
    }

    public void gehituMailegua(Mailegu mailegu){
        if (this.mailegukop==5){
            System.out.println("Mailegu limitea");
        }
        this.maileguak[mailegukop]= mailegu;
        mailegukop++;
    }

    public void erakutsi(){
        System.out.println("Izena= "+this.izena);
        System.out.println("NAN= "+this.NAN);

        for (int a=0; a<this.mailegukop; a++){
            System.out.println("Mailegua= "+this.maileguak);
        }
    }
    */
}
