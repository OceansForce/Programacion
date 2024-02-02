package enpresa;

public class Mugikor {

    private String zenbakia;
    private int bateria;

    public Mugikor(String zenbakia, int bateria) {
        this.zenbakia = zenbakia;
        if (bateria>0 && bateria<11){
            this.bateria = bateria;
        }
        else {
            System.out.println("Bateria 1 eta 10 tartean izanb behar da.");
        }
    }
    public void erabili(){
        this.bateria--;
    }

    public int getBateria() {
        return bateria;
    }
}

