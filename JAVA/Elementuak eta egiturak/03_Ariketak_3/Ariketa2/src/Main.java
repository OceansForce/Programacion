import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu zenbaki oso bat:");
        int zenb1 = sc.nextInt();

        for (int i=0; i<=zenb1; i++){

            for (int j=0; j<i; j++){
                System.out.print(i);
            }

            System.out.print("\n");
        }
    }
}