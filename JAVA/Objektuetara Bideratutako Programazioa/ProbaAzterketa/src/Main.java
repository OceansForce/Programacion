import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Langilea l1= new Langilea("Julen", "Garcia", 19, "Readbull", Langilea.Lanmota.Ingeniaria);
    }

    HashMap<String,Langilea> tadeak= new HashMap<>();

    private void erakutsi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zein taldea nahi duzu ikusi:");
        String taldea= sc.next();
        System.out.println("1-Pilotoak     2-Ingeniariak       3-Zuzendariak");
        int aukera= sc.nextInt();

        Iterator<Langilea> it= new
        switch (aukera){
            case 1:

                if(tadeak.containsKey(taldea) && tadeak.containsValue(Langilea.Lanmota.Pilotoa)){

                }


                break;
            case 2:

                break;

            case 3:

                break;
        }
    }

    private void gehitutaldea(Langilea langilea){


    }

    private void ezabatutaldea(Langilea langilea){
        if (langilea.equals(Langilea.Lanmota.Ingeniaria)){
            ingeni.remove(langilea);
        } else if (langilea.equals(Langilea.Lanmota.Pilotoa)) {
            pilot.remove(langilea);
        }else {
            zuzen.remove(langilea);
        }
    }

    private void gehitulangiletaldean(Langilea langilea){

    }


}