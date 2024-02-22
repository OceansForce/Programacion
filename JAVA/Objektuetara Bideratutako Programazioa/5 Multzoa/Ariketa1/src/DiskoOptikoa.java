public abstract class DiskoOptikoa extends Garapen_Diskoak{


    public boolean birgrabagarria;

    public DiskoOptikoa(double edukiera, String unitatea, int okupatutakoPortz, boolean birgrabagarria) {
       super(edukiera, unitatea, okupatutakoPortz);
        this.birgrabagarria = birgrabagarria;
    }
    public abstract void irakurri();
    public abstract void grabatu(double datua);
}
