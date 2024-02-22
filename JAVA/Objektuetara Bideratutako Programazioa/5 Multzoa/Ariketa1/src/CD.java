public class CD extends DiskoOptikoa implements Diskoa{

    public CD(double edukiera, String unitatea, int okupatutakoPortz, boolean birgrabagarria) {
        super(edukiera, unitatea, okupatutakoPortz, birgrabagarria);
    }

    @Override
    public void irakurri() {
        System.out.println("CD dispositibo bat irakurtzen");
    }

    @Override
    public void grabatu(double datua) {
        try {

            if (okupatutakoPortz>=100){
                throw new Exception("CD diskoa beteta dago");
            } else if (!birgrabagarria && datua>edukiera) {
                throw new Exception("CD diskoa ez da birgrabagarria edo edukia gainditu duzu");
            }
            System.out.println("CD dispositiboa grabatzen");
            double duenDatuKop = (okupatutakoPortz * edukiera) / 100;
            okupatutakoPortz = (int) (((duenDatuKop + datua) * 100) / edukiera);
            System.out.println(okupatutakoPortz);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void biratu() {
        System.out.println("200 dispositiboa 500 rpm abiaduran biratzen du");
    }
}
