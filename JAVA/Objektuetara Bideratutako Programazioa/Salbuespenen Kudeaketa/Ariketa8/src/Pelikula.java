import java.sql.Time;
import java.util.Objects;

public class Pelikula extends Object{

    String izenburua;
    int ekoizpen_urtea;
    int iraupena;

    public Pelikula(String izenburua, int ekoizpen_urtea, int iraupena) throws Salbuespenak{
       try {
           if (izenburua.equals("")){
               throw new Salbuespenak("Ezin da jarri izenburu hutsa jarri");
           }

       }catch (Salbuespenak e){
           System.err.println("Errorea= "+e.getMessage());
       }
       try {
            if (ekoizpen_urtea<0 || iraupena<0){
                throw new Salbuespenak("Ezin da jarri urtea edo iraupera negatiboan");
            }

       }catch (Salbuespenak e){
            System.err.println("Errorea= "+e.getMessage());
       }
        this.izenburua=izenburua;
        this.ekoizpen_urtea=ekoizpen_urtea;
        this.iraupena=iraupena;
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
