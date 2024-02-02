import enpresa.Enpresa;
import enpresa.Langile;
import enpresa.Mugikor;

public class Main2 {
    public static void main(String[] args) {

        Mugikor m1= new Mugikor("343242354", 9);
        Langile l1= new Langile("Julen","3234343543D", 32, 43, m1 );
        Langile l2= new Langile("Urko","67676765454", 23, 54, m1 );

        Enpresa e1=new Enpresa("Google", 60, l1);
        e1.kontratatuGerentea(l2);
        System.out.println(e1);
        e1.lana();
        e1.lana();
        System.out.println(e1);
    }
}
