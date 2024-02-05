import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class PuntuaSistema {

    ArrayList <Puntua> lista;

    public PuntuaSistema(){
        this.lista= new ArrayList<>();
    }

    public PuntuaSistema( Puntua parametroak){
        lista.add(parametroak);
    }

    public void erakutsi(){
        for ( Puntua parametroa : this.lista){
            parametroa.inprimatuPuntua();
        }
    }

    AbstractList<Puntua> alderantzizkatu(){

        AbstractList<Puntua>  emaitza = new ArrayList<>();
        /*for (int i=this.lista.size()-1 ; i>=0; i--){
            emaitza.add()
        }*/

        for (int i=0 ; i<this.lista.size(); i++){
            emaitza.add(0,this.lista.get(i));
        }
        return emaitza;
    }

    Puntua bigarrenKoadrantean(){
        Iterator<Puntua> it = this.lista.iterator();
        while (it.hasNext()){
            Puntua puntua = it.next();
            if(puntua.koadratea().equals("2. koadratea")){
                return puntua;
            }
        }
        return null;
    }

    boolean zeroZero(){
        for (int i=0; i<this.lista.size(); i++) {
            Puntua nirePuntua= this.lista.get(i);
            if (nirePuntua.equals(new Puntua(0,0))
            ){
             return true;
            }
        }
        return false;
    }

    boolean batBatDago(){
        for (int i=0; i<this.lista.size(); i++) {
            Puntua nirePuntua= this.lista.get(i);
            if (nirePuntua.equals(new Puntua(1,1))
            ){
                return true;
            }
        }
        return false;
    }

    /*void ezabatuDistatzia10(){
        for (int i=0; i<this.lista.size(); i++){

        }
    }*/

    void ezabatu4Kuadrantea(){
        Iterator<Puntua> it = this.lista.iterator();

    }


}
