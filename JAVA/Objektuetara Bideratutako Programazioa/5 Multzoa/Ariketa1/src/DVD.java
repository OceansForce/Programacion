public  class DVD extends DiskoOptikoa implements Diskoa{


    public DVD(double edukiera, String unitatea, int okupatutakoPortz, boolean birgrabagarria) {
        super(edukiera, unitatea, okupatutakoPortz, birgrabagarria);
    }

    @Override
    public void irakurri() {
        System.out.println("DVD dispositibo bat irakurtzen");
    }
    @Override
    public void grabatu(double datua) {
        try {

            if (okupatutakoPortz>=100){
                throw new Exception("DVD diskoa beteta dago");
            } else if (!birgrabagarria && datua>edukiera) {
                throw new Exception("DVD diskoa ez da birgrabagarria edo edukia gainditu duzu");
            }
            System.out.println("DVD dispositiboa grabatzen");
            double duenDatuKop = (okupatutakoPortz * edukiera) / 100;
            okupatutakoPortz = (int) (((duenDatuKop + datua) * 100) / edukiera);
            System.out.println(okupatutakoPortz);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void biratu() {
        System.out.println("570 dispositiboa 160 rpm abiaduran biratzen du");
    }
}
