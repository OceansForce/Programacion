package surf;

public abstract  class Surflari {

    private String izena;
    private int rankingPos;
    private int energia;
    private Babesle babestea;

    public Surflari(String izena, int rankingPos, int energia, Babesle babestea) {
        this.izena = izena;
        this.rankingPos = rankingPos;
        if (energia>=0 && energia<=100) {
            this.energia = energia;
        }else {
            System.out.println("Energia 0tik 100era izan behar da.");
        }
        this.babestea = babestea;
    }

     public void surfeatu(){
            if ((energia=energia-5)<0){
                energia=0;
            }else{
                energia=energia-5;
            }
    }

    public void atsedenHartu(){
        if ((energia=energia+10)>100){
            energia=100;
        }else {
            energia=energia+10;
        }

    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getRankingPos() {
        return rankingPos;
    }

    public Babesle getBabestea() {
        return babestea;
    }

    @Override
    public String toString() {
        return izena+";";
    }
}
