import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StreamerKomunitatea {
    private HashMap<String, ArrayList<Streamer>> komunitateak;

    public StreamerKomunitatea() {
        komunitateak = new HashMap<>();
    }

    void geituStreamerak(String izena, ArrayList<Streamer> streamerrak){
        komunitateak.put(izena,streamerrak);
    }

    void aLetrakoStreamerak (){
        Iterator<String> t1 = komunitateak.keySet().iterator();
        while (t1.hasNext()) {
            for (Streamer s : komunitateak.get(t1.next())) {

            }
        }
    }

    ArrayList<Streamer> jolastenDute(String bideojokoa){
        ArrayList<Streamer> jolastu= new ArrayList<>();
        Iterator<String> t1 = komunitateak.keySet().iterator();
        while (t1.hasNext()) {
            String urrengoa=t1.next();
            for (Streamer s : komunitateak.get(urrengoa)) {
                for (int i=0 ; i<s.getVideojokoak().length ; i++) {
                    if (s.getVideojokoak()[i].equals(bideojokoa)) {
                       jolastu.add(s);
                    }
                }
            }
        }
        return jolastu;
    }

    void erakutsi(){
        Iterator<String> t1 = komunitateak.keySet().iterator();
        while (t1.hasNext()) {
            String urrengoa=t1.next();
            System.out.println(urrengoa+":");
            for (Streamer s : komunitateak.get(urrengoa)) {
                System.out.println(s);
            }
        }
    }
}
