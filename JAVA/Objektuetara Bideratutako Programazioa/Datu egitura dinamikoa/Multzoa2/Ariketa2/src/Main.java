import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> zenbakiak1= new HashSet<>();
        HashSet <Integer> zenbakiak2= new HashSet<>();

        System.out.println("Sartu zenbaki oso positiboa bat:");
        int zenb1= sc.nextInt();
        int zenb2= sc.nextInt();

        a(zenb1, zenbakiak1);
        a(zenb2, zenbakiak2);
        zenbakiak1.retainAll(zenbakiak2);
        Iterator <Integer> it= zenbakiak1.iterator();
        int min =zenb1;

        while (it.hasNext()){
            int buk = it.next();

            if (buk<min && buk!=1){
                min=buk;
            }
        }
        System.out.println(min);
        sc.close();
    }

    public static void a (int zenb1, HashSet zenb2){
        for (int i=1; i<=zenb1; i++){
            if (zenb1%i==0){
                zenb2.add(i);
            }
        }
    }
}