public class Zirkulua {

    String kolorea;
    double erradioa;

    double diametro;

    double azalera;
    double perimetroa;


    public  Zirkulua(String kolorea, double erradioa){
        this.kolorea=kolorea;
        this.erradioa=erradioa;
        this.diametro=erradioa+erradioa;
    }
    public double azalera(){

        azalera= (erradioa*erradioa)*Math.PI;
        return azalera;
    }

    public void inprimatuPerimetroa(){
        double diametro=erradioa+erradioa;
        double perimetroa= diametro*Math.PI;
        System.out.println("Zirkuluaren Perimetroa= "+perimetroa);
    }

    public void handiaDa(){
        if(azalera>20){
            System.out.println("Zirkulua handia da");
        }

        else{
            System.out.println("Zirkulua txikia da");
        }
    }

    public boolean berdinaDa(Object object){

        Zirkulua p1 = (Zirkulua)object;

        return this.kolorea.equals(p1.kolorea) && this.erradioa== p1.erradioa;

    }


    public void erakutsi(){
        System.out.println(kolorea+" "+erradioa);
    }
}


