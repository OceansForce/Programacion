import java.io.*;
import java.util.ArrayList;

public class LangileKudeatzaile {

    private String bidea;

    public LangileKudeatzaile(String bidea) {
        this.bidea = ".\\"+bidea;
    }

    void gordeLangileak(ArrayList<Langile> arrayList) throws IOException {
        FileOutputStream fos = new FileOutputStream(bidea,true);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        for (Langile la: arrayList) {
            oos.writeObject(la);
        }
        oos.writeObject(null);
        oos.close();
        fos.close();
    }
    void erakutsiLangileak() throws IOException, ClassNotFoundException {
        FileInputStream fis= new FileInputStream(bidea);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object irakurriobjetuak=ois.readObject();
        while (irakurriobjetuak != null) {
            Langile langileak = (Langile)irakurriobjetuak;
            langileak.erakutsi();
            irakurriobjetuak= ois.readObject();
        }
        ois.close();
    }

    String bilatuLangilea(String izena) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(bidea);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object irakurriobjetuak = ois.readObject();
        while (irakurriobjetuak != null) {
            Langile langileak = (Langile) ois.readObject();
            if (langileak.getIzena().equals(izena)){
                ois.close();
                return "Langilea= "+langileak;
            }
        }
        return null;
    }

    void sortuMugikorrenFitxategia (String bidea) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(bidea,true);
        ObjectOutputStream oos= new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(bidea);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object irakurriobjetuak = ois.readObject();
        while (irakurriobjetuak != null) {
            Langile langileak = (Langile) ois.readObject();

                ois.close();

        }
    }
}
