import eskaerak.*;
import elementuak.*;
public class Main {
    public static void main(String[] args) {

        Elementu elem1= new Elementu("2312B", "Li","Julen" );
        Diskoak disk1=new Diskoak("3232V", "Ba", "Manex", "PapoPe" );
        Erabiltzailea erab1= new Erabiltzailea("DASD32143", "Iker");
        Mailegua maile1= new Mailegua(erab1);


        elem1.elementuaErakutxi();

        disk1.erakutsi();

        erab1.erakutsiErabiltzailea();

        System.out.println(maile1.erakutsiMailegua());



    }
}