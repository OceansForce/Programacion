public class Loro extends Txori{

    private char zonaldea;
    private String Kolorea;
    public Loro (char sexua, int adina, char zonaldea, String Kolorea){
        super(sexua, adina);
        this.zonaldea=zonaldea;
        this.Kolorea=Kolorea;
    }

    public void nongoaZara(){
        if (zonaldea=='I'){
            System.out.println("Iparraldea");
        } else if (zonaldea=='H') {
            System.out.println("Hegoaldea");
        }else if (zonaldea=='E'){
            System.out.println("Ekialdea");
        } else if (zonaldea=='M') {
            System.out.println("Mendebaldea");
        }
    }

    public void aldatuZonaldea(char zonaldea){
        this.zonaldea=zonaldea;
    }
}
