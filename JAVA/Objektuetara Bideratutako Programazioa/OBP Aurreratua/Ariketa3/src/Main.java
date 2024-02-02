import langileak.KomisioLangile;
import langileak.OrdukoLangile;
import langileak.SoldatapekoKomisioLangile;
import langileak.SoldatapekoLangile;

public class Main {
    public static void main(String[] args) {

        //Langile l1= new Langile();
        SoldatapekoLangile sl1= new SoldatapekoLangile("Julen", "Garcia", 24, 56);
        KomisioLangile kl1= new KomisioLangile("Julen", "Garcia", 23, 32, 123);
        SoldatapekoKomisioLangile skl1= new SoldatapekoKomisioLangile("Julen", "Garcia", 22, 32, 43, 89);
        OrdukoLangile ol1= new OrdukoLangile("Julen", "Garcia", 21, 48, 80);

        System.out.println("**************************");
        System.out.println(sl1);
        System.out.println("**************************");
        System.out.println(kl1);
        System.out.println(kl1.irabaziak());
        System.out.println("**************************");
        System.out.println(skl1);
        System.out.println(skl1.irabaziak());
        System.out.println("**************************");
        System.out.println(ol1);
        System.out.println(ol1.irabaziak());
        System.out.println("**************************");
    }
}