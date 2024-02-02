import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu esaldi bat:");
        String esal = sc.nextLine();

        System.out.println("Sartu hitz bat:");
        String hitz = sc.nextLine();
        sc.close();

        String esal2 = esal ;
        boolean bilatu = esal2.contains(hitz);

        if (bilatu == true){
            System.out.println("Esaldian sartutako hitza dago");
        }
        else{
            System.out.println("Esaldian ez dago sartutako hitza");
        }


        }
    }
