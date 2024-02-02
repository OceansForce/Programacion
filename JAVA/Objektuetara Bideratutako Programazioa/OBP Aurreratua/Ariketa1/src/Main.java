public class Main {
    public static void main(String[] args) {

        Piolin p1= new Piolin( 'A', 4, 23);
        Loro l1= new Loro('E', 3, 'I', "Urdina");

        p1.norNaiz();
        l1.norNaiz();

        p1.neurtu();

        l1.nongoaZara();

        p1.aldatuTamaina(31);
        p1.neurtu();

        l1.aldatuZonaldea('E');
        l1.nongoaZara();

        System.out.println(Txori.kopurua);


    }
}