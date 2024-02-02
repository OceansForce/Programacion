public class zatizero {

    public static float main (float a, float b ){
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.err.println("Zati zero");
        }catch (Exception c){
            System.err.println("Kontrolatu gabeko errorea");
        }
        return 0;
    }
}
