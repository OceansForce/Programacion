import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Apaindegi apain1= new Apaindegi(19, 9);

        Bezero bez1 =new Bezero("Julen","1", true, "Premium");
        Bezero bez2 =new Bezero("Iker","2", true, "Urre");
        Bezero bez3 =new Bezero("Eva","3", false, "");

        LocalDate date1=  LocalDate.of( 2024,  3,  1);
        Bisita bisita1= new Bisita(bez1, date1);

        LocalDate date2=  LocalDate.of( 2024,  4,  12);
        Bisita bisita2= new Bisita(bez2, date2);

        LocalDate date3=  LocalDate.of( 2024,  6,  5);
        Bisita bisita3= new Bisita(bez3, date3);

        bisita1.kalkulatuZenbatekoa(40);
        bisita2.kalkulatuZenbatekoa(40);
        bisita3.kalkulatuZenbatekoa(40);

        apain1.gehituBizita(bez1,date1);

        System.out.println(apain1.erakutsiBisita());
    }
}