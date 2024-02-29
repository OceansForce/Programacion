import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
            int kar = br.read();
            while (kar != -1)
            {
                bw.write(kar);
                kar = br.read();
            }
            bw.close();

            br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(args[2]));
            char[] karaktereak = new char[20];
            int charKop = br.read(karaktereak);
            while (charKop != -1)
            {
                bw2.write(karaktereak);
                karaktereak = new char[20];
                charKop = br.read(karaktereak);
            }
            bw2.close();
            br.close();

        }
        catch (FileNotFoundException ex)
        {
            System.err.println("Fitxategiaren izena ez da egokia");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }
}
