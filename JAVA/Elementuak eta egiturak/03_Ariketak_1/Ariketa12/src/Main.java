import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Sartu lehen zenbakia:");
                int zenb1 = sc.nextInt();
            System.out.println("Sartu bigarren zenbakia:");
                int zenb2 = sc.nextInt();
            System.out.println("Sartu hirugarren zenbakia:");
                int zenb3 = sc.nextInt();
            System.out.println("Sartu laugarrena zenbakia:");
                int zenb4 = sc.nextInt();
            System.out.println("Sartu bostgarren zenbakia:");
                int zenb5 = sc.nextInt();
        sc.close();

        ArrayList lista = new ArrayList<>();

        lista.add(zenb1);
        lista.add(zenb2);
        lista.add(zenb3);
        lista.add(zenb4);
        lista.add(zenb5);

        Collections.sort(lista);

        System.out.println("Zenbaki handiena "+lista.get(4)+" da eta txikiena "+lista.get(0)+" da.");


    }
}