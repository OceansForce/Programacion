import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StreamerKomunitatea sk1= new StreamerKomunitatea();
        String[] jokoak={"LoL", "Minecraft", "GTV"};
        Streamer s1= new Streamer("Illojuan", "1988/08/23", jokoak);
        Streamer s2= new Streamer("Ibai", "1932/08/23", jokoak);
        Streamer s3= new Streamer("ElRich", "2000/08/23", jokoak);
        ArrayList<Streamer> arraST= new ArrayList<>();
        arraST.add(s1);
        arraST.add(s2);
        arraST.add(s3);
        sk1.geituStreamerak("Youtube",arraST);
        System.out.println(sk1.jolastenDute("LoL"));
        sk1.erakutsi();
    }
}