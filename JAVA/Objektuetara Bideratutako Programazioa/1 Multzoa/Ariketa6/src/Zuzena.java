public class Zuzena {

   private float zabalera;
   private Puntua p1;
   private Puntua p2;
   public Zuzena (float zab, Puntua pp1, Puntua pp2){
       p1=pp1;
       p2=pp2;
       zabalera=zab;
   }

    public Zuzena (float zab, int x1, int y1, int x2, int y2){
        p1= new Puntua (x1, y1);
        p2= new Puntua (x2, y2);
        zabalera=zab;
    }

    public boolean horizontalaDa(){
      return p1.y==p2.y;
    }

    public boolean bertikalada(){
        return p1.x==p2.x;
    }
    public double luzera(){
       double h = Math.sqrt(Math.pow(p1.x- p2.x, 2)+ Math.pow(p1.y-p2.y, 2));
       return h;
    }

    public Zuzena luzeena(Zuzena z){
       if (z.luzera()> this.luzera()){
           return z;
       }

       else if (z.luzera()> this.luzera()){
           return this;
       }

       else {
           System.out.println("Berdinak dira");
           return null;
       }

    }


}
