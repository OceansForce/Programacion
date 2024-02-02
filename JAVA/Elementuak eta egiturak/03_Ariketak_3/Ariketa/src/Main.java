import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zenb = sc.nextInt();

        for (int i=0; i<zenb ;i++){

            for (int j=0; j<i ;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}