package torneo;
import surf.*;

public class Main {
    public static void main(String[] args) {

        Babesle b1= new Babesle("Julen","2005/5/2", true);
        Babesle b2= new Babesle("Iker","2003/5/2", true);
        Babesle b3= new Babesle("Alberto","2017/5/2", false);
        Babesle b4= new Babesle("Ana","2011/5/2", true);

        Babesle[] babesleak = {b1,b2,b3,b4};

      Torneo t1= new Torneo("ZarautzSurf",babesleak);
      OlatuHandikoSurflari s1= new OlatuHandikoSurflari("Ibai", 1, 93, b1, 40, true);
      s1.surfeatu();
      s1.atsedenHartu();
      t1.gehituSurflaria(s1);
      t1.gordeFitxategian();
      t1.igoTorneoKategoria();
      t1.surflariakBabeslearekin(b1);
      t1.surflariakTorneokoBabeslearekin();
    }
}