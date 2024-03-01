import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            DataInputStream dis= new DataInputStream(new FileInputStream(".\\irudia.jpg"));
            DataOutputStream dos= new DataOutputStream(new FileOutputStream(".\\irudia.png"));
            dos.write(dis.readAllBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}