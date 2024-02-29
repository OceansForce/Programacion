package surf;

import java.util.Date;
import java.util.Objects;

public class Babesle {

    private String izena;
    private String sorreraData;
    private boolean multinazionala;

    public Babesle(String izena, String sorreraData, boolean multinazionala) {
        this.izena = izena;
        this.sorreraData = sorreraData;
        this.multinazionala = multinazionala;
    }

    String erakutsi(){
        if (multinazionala) {
            return "["+izena + '\'' + sorreraData + '\'' + "bai]";
        }else {
            return "["+izena + '\'' + sorreraData + '\'' + "ez]";
        }
    }

    @Override
    public String toString() {
        return "Babesle{" +
                "izena='" + izena + '\'' +
                ", sorreraData='" + sorreraData + '\'' +
                ", multinazionala=" + multinazionala +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Babesle babesle)) return false;
        return multinazionala == babesle.multinazionala && Objects.equals(izena, babesle.izena) && Objects.equals(sorreraData, babesle.sorreraData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(izena, sorreraData, multinazionala);
    }
}
