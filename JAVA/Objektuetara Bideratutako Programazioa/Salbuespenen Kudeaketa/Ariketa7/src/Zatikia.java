public class Zatikia  {

    private int a;
    private int b;

     Zatikia(int a, int b) throws ZatikiSalbuespena{
       try {
           if (b==0) {
               throw new ZatikiSalbuespena("Ezin da zatitzaile bezala zero duen zatikia sortu");
           }
           this.a = a;
           this.b = b;
       }catch (ZatikiSalbuespena e){
           System.err.println("Errorea="+e.getMessage());
       }
    }
     Zatikia() {
        this.a = 1;
        this.b = 1;
    }

    @Override
    public String toString() {
        return "Zatikia{" +
                 a +"/"+b +
                '}';
    }

    Zatikia batura(int c, int d) throws ZatikiSalbuespena{
         if (this.b==0){
             return null;
         }
         try {
                int erantzuna1 = 0;
                int erantzuna2 = 0;

                if (d != b) {
                    erantzuna2 = b * d;
                    erantzuna1 = (c * b) + (a * d);
                } else {
                    erantzuna1 = a + c;
                    erantzuna2 = b + d;
                }

                int zatitzailea = zkh(erantzuna1, erantzuna2);

                if (erantzuna1 == 0) {
                    throw new ZatikiSalbuespena("Eragiketa honen emaitzak baliozkoa ez de zatiki bat sortzen du");
                }
                return new Zatikia(erantzuna1 / zatitzailea, erantzuna2 / zatitzailea);
            }catch (ZatikiSalbuespena e){
                System.err.println("Errorea batura="+e.getMessage());
            }
            return null;
    }

    Zatikia kendu(int c, int d) throws ZatikiSalbuespena {
        if (this.b==0){
            return null;
        }
         try {

            int erantzuna1 = 0;
            int erantzuna2 = 0;

            if (d != b) {
                erantzuna2 = b * d;
                erantzuna1 = (c * b) - (a * d);
            } else {
                erantzuna1 = a - c;
                erantzuna2 = b;
            }

            int zatitzailea = zkh(erantzuna1, erantzuna2);

            if (erantzuna1 == 0) {
                throw new ZatikiSalbuespena("Eragiketa honen emaitzak baliozkoa ez de zatiki bat sortzen du");
            }

            return new Zatikia(erantzuna1 / zatitzailea, erantzuna2 / zatitzailea);
        }catch (ZatikiSalbuespena e){
            System.err.println("Errorea kendu="+e.getMessage());
        }
        return null;
    }

    Zatikia biderketa(int c, int d) throws ZatikiSalbuespena{
        if (this.b==0){
            return null;
        }
         try {
            int erantzuna1 = 0;
            int erantzuna2 = 0;

            erantzuna2 = b * d;
            erantzuna1 = a * c;

            int zatitzailea = zkh(erantzuna1, erantzuna2);

            if (erantzuna1 == 0) {
                throw new ZatikiSalbuespena("Eragiketa honen emaitzak baliozkoa ez de zatiki bat sortzen du");
            }

            return new Zatikia(erantzuna1 / zatitzailea, erantzuna2 / zatitzailea);
        }catch (ZatikiSalbuespena e){
            System.err.println("Errorea biderketa="+e.getMessage());
        }
        return null;
    }

    Zatikia zatikia(int c, int d) throws ZatikiSalbuespena{
        if (this.b==0){
            return null;
        }
         try {
            int erantzuna1 = 0;
            int erantzuna2 = 0;

            erantzuna2 = b * c;
            erantzuna1 = a * d;

            int zatitzailea = zkh(erantzuna1, erantzuna2);

            if (erantzuna1 == 0) {
                throw new ZatikiSalbuespena("Eragiketa honen emaitzak baliozkoa ez de zatiki bat sortzen du");
            }

            return new Zatikia(erantzuna1 / zatitzailea, erantzuna2 / zatitzailea);
        }catch (ZatikiSalbuespena e){
            System.err.println("Errorea zatikia="+e.getMessage());
        }
        return null;
    }

     static int zkh(int erantzuna1, int erantzuna2) throws ZatikiSalbuespena{

        int a1= Math.abs(erantzuna1);
        int a2= Math.abs(erantzuna2);
        if(a2==0){
            return a1;
        }
        int b1;
        while (a2!=0){
            b1= a1 % a2;
            a1=a2;
            a2=b1;
        }
        return a1;
    }
}
