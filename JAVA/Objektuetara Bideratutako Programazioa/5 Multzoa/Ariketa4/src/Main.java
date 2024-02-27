
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {

        Instant orduaHasiera= Instant.now();
        ArrayList<Integer> zen = new ArrayList<>();
        ausazkoZenbakia(zen, 10);
        for (int a: zen){
            System.out.print(a+"-");
        }
        System.out.println("\n");

        CocktailShakerSort(zen);
        for (int a: zen){
            System.out.print(a+"-");
        }
        System.out.println("\n");

        elementuakTrukatu(zen,0,2);
        for (int a: zen){
            System.out.print(a+"-");
        }
        Instant orduaBukaera= Instant.now();
        System.out.println("\n");
        System.out.println(Duration.between(orduaHasiera,orduaBukaera));

    }

    public static void CocktailShakerSort(ArrayList<Integer> zen) {
        int n = zen.size();
        for (int a=0 ; a<n-1; a++) {
            for (int b = 0; b < n - a - 1; b++) {
                if (zen.get(b) > zen.get(b + 1)) {
                    int h= zen.get(b);
                    zen.set(b, zen.get(b + 1));
                    zen.set(b + 1, h);
                }
            }
            for (int c = n-1; c >0; c--) {
                if (zen.get(c-1) > zen.get(c)) {
                    int h= zen.get(c);
                    zen.set(c-1, zen.get(c));
                    zen.set(c, h);
                }
            }
        }

    }

    public static void ausazkoZenbakia(ArrayList<Integer> zen, int zenbat){
        Random rc= new Random();
        boolean aktibatu= true;
        while (aktibatu){
            zen.add(rc.nextInt(200));
            if (zen.size()>zenbat){
                aktibatu=false;
            }
        }
    }

    public static void elementuakTrukatu(ArrayList<Integer> zen, int bat, int bi){
        int aurrenekoa= zen.get(bat);
        zen.set(bat, zen.get(bi));
        zen.set(bi,aurrenekoa);
    }
}