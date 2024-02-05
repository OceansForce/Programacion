
public class Main {
    public static void main(String[] args) {

        Pelikula p1= new Pelikula("jojo", 6, 9);
        Pelikula p2= new Pelikula("Iroman", 4, 2);
        Pelikula p3= new Pelikula("Oceans Eleven", 2, 1);
        Zinema z1= new Zinema("Julen", 6);
        z1.gehituPelikula(p1, 5);
        z1.gehituPelikula(p2, 1);
        z1.gehituPelikula(p3, 3);

    }
}