
public class Main {
    public static void main(String[] args) {

        CD cd= new CD(100,"CD", 10, false);
        cd.irakurri();
        cd.grabatu(33.52);
        cd.biratu();

        DVD dvd= new DVD(100,"DVD", 10, false);
        dvd.irakurri();
        dvd.grabatu(33.52);
        dvd.biratu();
    }
}