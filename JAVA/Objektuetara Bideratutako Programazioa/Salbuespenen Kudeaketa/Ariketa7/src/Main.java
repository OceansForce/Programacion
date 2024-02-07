public class Main {
    public static void main(String[] args) throws ZatikiSalbuespena {
        try {
            Zatikia z1 = new Zatikia(2, 3);
            System.out.println(z1.batura(3, 3));
            System.out.println(z1.kendu(5, 3));
            System.out.println(z1.biderketa(3, 9));
            System.out.println(z1.zatikia(3, 9));
        }catch (ZatikiSalbuespena e){
        System.err.println("Errorea="+e.getMessage());
        }


    }
}