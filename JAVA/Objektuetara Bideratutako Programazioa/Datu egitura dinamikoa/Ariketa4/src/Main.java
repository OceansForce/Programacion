public class Main {
    public static void main(String[] args) {

       Agenda a1 = new Agenda(6);
       String[] telefonoak= {"5456435","32","8695769854"};
       String[] telefonoak2= {"32","435567676","09689076"};
       String[] telefonoak3= {"7879879","46534230","32"};
       a1.gehituSarrera("Julen", telefonoak);
       a1.gehituSarrera("Iker", telefonoak2);
       a1.gehituSarrera("Manex", telefonoak3);
       a1.erakutsi();
       a1.bilatuizena("Julen");
       a1.bilatuizena("Manex");

       /*String a = "32";
       String katea = a+",0,0";
       String[] array = katea.split(",");*/
       a1.zenbakiKopurua("32");

    }
}