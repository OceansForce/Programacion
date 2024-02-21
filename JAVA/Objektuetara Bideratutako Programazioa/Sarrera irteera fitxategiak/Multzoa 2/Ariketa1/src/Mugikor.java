import java.io.Serializable;

public class Mugikor implements Serializable {

    private int id_mugikorra;
    private int bateria;

    public Mugikor(int id_mugikorra, int bateria) {
        this.id_mugikorra = id_mugikorra;
        try {
            if (bateria < 100 && bateria > 0) {
                this.bateria = bateria;
            } else {
                throw new Exception("Bateria ezin du izan 100 baino geilago edo 0 baino gutxiago");
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    String erakutsi (){
       return  "Mugikorrak="+id_mugikorra+"  Bateria="+bateria;
    }

    void kargatu (int zenbkargatu){
        try {
            if (zenbkargatu<0){
                throw new Exception("Kargatzen dena ezin da izan negatiboa");
            } else if ((bateria + zenbkargatu) > 100) {
                bateria = 100;
            } else {
                bateria = bateria + zenbkargatu;
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    void deitu(int deiMinutuak){
        deiMinutuak=deiMinutuak*2;
        bateria=bateria-deiMinutuak;
    }

    @Override
    public String toString() {
        return "\t" + id_mugikorra +
                "\t" + bateria;
    }
}
