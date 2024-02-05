import java.sql.Time;
import java.util.Objects;

public class Pelikula extends Object{

    String izenburua;
    int ekoizpen_urtea;
    int iraupena;

    public Pelikula(String izenburua, int ekoizpen_urtea, int iraupena) throws Salbuespenak{
       try {
           this.izenburua=izenburua;
           this.ekoizpen_urtea=ekoizpen_urtea;
           this.iraupena=iraupena;
       }catch (Salbuespenak e){

       }

    }

    @Override
    public String toString() {
        return "Pelikula{" +
                "izenburua='" + izenburua + '\'' +
                ", ekoizpen_urtea=" + ekoizpen_urtea +
                ", iraupena=" + iraupena +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Pelikula pelikula)) return false;
        return ekoizpen_urtea == pelikula.ekoizpen_urtea && iraupena == pelikula.iraupena && Objects.equals(izenburua, pelikula.izenburua);
    }

    @Override
    public int hashCode() {
        return Objects.hash(izenburua, ekoizpen_urtea, iraupena);
    }
}
