public abstract class Kanario extends Txori{

    private int tamaina;
    Kanario(char sexua, int adina,DatuPertsonal izenak, int tamaina ) {
        super(sexua, adina, izenak);
        this.tamaina=tamaina;
    }

    public Kanario(char sexua, int adina, DatuPertsonal izenak){

        super(sexua, adina,izenak);
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
