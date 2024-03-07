// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
            public static void main(String[] args) {
                System.out.println("Batezbestekoaren Bilatzailea v0.1");
                double avg = bilatuBatezBestekoa(args);
                System.out.println("Hau da batezbestekoa: " + avg);
            }

            private static double bilatuBatezBestekoa(String[] input) {
                double result = 0;
                for (String s : input) {
                    result += Integer.parseInt(s);
                }
                return result;
            }
        }