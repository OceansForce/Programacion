import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> zen = new ArrayList<>();
        zen.add(5);
        zen.add(4);
        zen.add(32);
        zen.add(1);
        bubbleSort(zen);

        /*for (int a=0 ; a<zen.size()-1; a++){
            for (int b=0; b<zen.size()-a-1; b++){
                if (zen.get(b)> zen.get(b+1)){
                  zen.set(b, zen.get(b+1));
                  zen.set(b+1, zen.get(b));
                }
            }
        }*/

        for (int a: zen){
            System.out.print(a+" ");
        }
    }

    public static void bubbleSort(ArrayList<Integer> zen) {
        int n = zen.size();
        for (int a=0 ; a<n-1; a++) {
            for (int b = 0; b < n - a - 1; b++) {
                if (zen.get(b) > zen.get(b + 1)) {
                    int h= zen.get(b);
                    zen.set(b, zen.get(b + 1));
                    zen.set(b + 1, h);
                }
            }
        }
<<<<<<< HEAD


=======
>>>>>>> fda5780dde4d62ddfef356e769b0255b45379c31
    }
}