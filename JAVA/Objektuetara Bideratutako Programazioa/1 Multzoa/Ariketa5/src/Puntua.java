public class Puntua {

    int x;
    int y;
    Puntua(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String koadratea(){
        if (this.x>0 && this.y>0){

            String ko1="1. koadratea";
            return ko1;
        }

        else if (this.x<0 && this.y>0){
            String ko2="2. koadratea";
            return ko2;
        }

        else if (this.x<0 && this.y<0) {
            String ko3="3. koadratea";
            return ko3;
        }

        else {
            String ko4="4. koadratea";
            return ko4;
        }
    }
    public void inprimatuPuntua (){
       System.out.println("X:" +this.x);
       System.out.println("Y:" +this.y);
       System.out.println("Kuadrantea: "+koadratea());

    }


}
