import enpresa.Langile;
import enpresa.Mugikor;

public class Main {
    public static void main(String[] args) {

        Mugikor m1= new Mugikor("343242354", 9);
        Langile l1= new Langile("Julen","3234343543D", 32, 43, m1 );
        System.out.println(l1);
        l1.lanEgin();
        l1.lanEgin();
        System.out.println(l1);
    }
}