public class Liburutegia {

    public static boolean BikoitiaDa(int bikoitia){
        if ((bikoitia%2)==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int digituKop(int kop){

        String proba = kop+"";
        return proba.length();
    }

    public  static boolean bostDitu(int kop){

        if (digituKop(kop)>=5){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean hamarrenMultiplo(int zenp){

        if ((zenp%10)==0){
            return true;
        }
        else {
            return false;
        }
    }
}
