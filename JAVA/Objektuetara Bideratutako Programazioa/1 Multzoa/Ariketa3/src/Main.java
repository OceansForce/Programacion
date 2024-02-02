public class Main {
    public static void main(String[] args) {

        Zirkulua zir=new Zirkulua("Urdina", 25);

        zir.azalera();
        System.out.println("Zirkuluaren azalera= "+zir.azalera());
        zir.inprimatuPerimetroa();
        zir.handiaDa();
        zir.erakutsi();

        Zirkulua zir2=new Zirkulua("Urdina", 25);
        zir2.azalera();
        System.out.println("Zirkuluaren azalera= "+zir.azalera());
        zir2.inprimatuPerimetroa();
        zir2.handiaDa();
        System.out.println(zir2.berdinaDa(zir));

        zir2.erakutsi();

    }
}