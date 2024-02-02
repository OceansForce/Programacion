public class Kanario extends Txori{

    public int tamaina;
    Kanario(char sexua, int adina, int tamaina ) {
        super(sexua, adina);
        this.tamaina=tamaina;
    }

    public Kanario(char sexua, int adina){
        super(sexua, adina);
    }

    public void neurtu(){
        if (tamaina>30){
            System.out.println("Handia");
        } else if (tamaina>15 && tamaina<30) {
            System.out.println("Ertaina");
        } else if (tamaina<30) {
            System.out.println("Txikia");
        }
    }

    public void aldatuTamaina(int tamaina){
        this.tamaina=tamaina;
    }
}
