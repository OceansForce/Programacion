import java.util.Random;
import java.util.random.RandomGenerator;
public class Dado {
    Random ran = new Random();
    int zenb1;
    int jaurtitze;

    public Dado(){
        int zenb1=0;
        int jaurtitze=0;
    }
    public void jaurti(){
        this.zenb1=ran.nextInt(6);
        this.jaurtitze++;
    }

    public void erakutsi(){
       System.out.println("Zenbakia atera da= "+zenb1);
        System.out.println("Jaurtiera egin dira= "+jaurtitze);
    }
}
