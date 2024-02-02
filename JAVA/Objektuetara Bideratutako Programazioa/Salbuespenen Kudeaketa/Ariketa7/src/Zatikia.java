public class Zatikia {

    private int a;
    private int b;

    public Zatikia(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Zatikia() {
        this.a = 0;
        this.b = 0;
    }

    @Override
    public String toString() {
        return "Zatikia{" +
                 a +"/"+b +
                '}';
    }

    Zatikia batura(int c, int d){

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

            return new Zatikia(erantzuna1 / zatitzailea, erantzuna2 / zatitzailea);
    }

    Zatikia kendu(int c, int d){
        int erantzuna1=0;
        int erantzuna2=0;

        if (d!=b){
            erantzuna2=b*d;
            erantzuna1= (c*b)-(a*d);
        }else {
            erantzuna1= a+c;
            erantzuna2=b+d;
        }

        int zatitzailea= zkh(erantzuna1,erantzuna2);

        return new Zatikia(erantzuna1/zatitzailea,erantzuna2/zatitzailea);
    }

    Zatikia biderketa(int c, int d){
        int erantzuna1= 0;
        int erantzuna2=0;

        erantzuna2=b*d;
        erantzuna1= a*c;

        int zatitzailea= zkh(erantzuna1,erantzuna2);

        return new Zatikia(erantzuna1/zatitzailea,erantzuna2/zatitzailea);
    }

    Zatikia zatikia(int c, int d){
        int erantzuna1= 0;
        int erantzuna2=0;

        erantzuna2=b*c;
        erantzuna1= a*d;

        int zatitzailea= zkh(erantzuna1,erantzuna2);

        return new Zatikia(erantzuna1/zatitzailea,erantzuna2/zatitzailea);
    }

     static int zkh(int erantzuna1, int erantzuna2){
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
