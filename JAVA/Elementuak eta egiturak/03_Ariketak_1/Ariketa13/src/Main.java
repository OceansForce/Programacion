import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la hora (HH:mm:ss): ");
        String horaString = scanner.nextLine();
        LocalTime hora = LocalTime.parse(horaString, DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.print("Introduce la hora (HH:mm:ss): ");
        String hora2String = scanner.nextLine();
        LocalTime hora2 = LocalTime.parse(hora2String, DateTimeFormatter.ofPattern("HH:mm:ss"));



        sc.close();

        LocalTime hora3 = hora.plusHours(hora2.getHour()).plusMinutes(hora2.getMinute()).plusSeconds(hora2.getSecond());
        System.out.print("Orduen batura hau da: "+hora3);


    }
}