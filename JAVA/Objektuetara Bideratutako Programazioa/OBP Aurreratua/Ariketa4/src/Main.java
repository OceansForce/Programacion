public class Main {
    public static void main(String[] args) {

        DatuPertsonal dp1 =new DatuPertsonal("Manex", "Julen");
        DatuPertsonal dp2 =new DatuPertsonal("Urko", "Xuban");
        DatuPertsonal dp3 =new DatuPertsonal("Iker", "Nikolas");

        Piolin p1= new Piolin('G', 4, dp1,32);
        Piolin p2= new Piolin('E', 7, dp2,43);
        Piolin p3= new Piolin('G', 2, dp3,23);

        p1.abestu();
        dp1.setTxoriIzena("Xabi");
        dp1.setJabeIzena("Alberto");
        System.out.println(dp1.getJabeIzena()+" - "+dp1.getTxoriIzena());

        Loro l2= new Loro('G', 5, dp2, 'E',"Gorria");
        System.out.println("Txori kopurua: "+Txori.getKopurua());

        Txori[] a = new Txori[9];
        a[0]=p1;
        a[1]=p2;
        a[2]=p3;
        a[3]=l2;

        for (int b=0; b< a.length; b++){
            if (a[b]!=null){
                a[b].abestu();
            }
        }

        /*Loro l1= new Loro('E', 3, dp3 ,'I', "Urdina");


        l1.norNaiz();

        l1.nongoaZara();


        l1.aldatuZonaldea('E');
        l1.nongoaZara();

        System.out.println(Txori.getKopurua());*/


    }
}