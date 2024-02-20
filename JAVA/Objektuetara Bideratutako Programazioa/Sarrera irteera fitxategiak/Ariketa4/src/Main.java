import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        AgendaKudeatzailea ag= new AgendaKudeatzailea("Agenda");
        Pertsona per1= new Pertsona("Julen", 666666666,"Aizarna");
        Pertsona per2= new Pertsona("Iker", 999999999,"Aizarna");
        Pertsona per3= new Pertsona("Aitor", 888888888,"Aizarna");
        ag.gehitupertsona(per1);
        ag.gehitupertsona(per2);
        ag.gehitupertsona(per3);
        ag.erakutsi();
        System.out.println(ag.pertsonaBilatu("Iker"));
    }
}