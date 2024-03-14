import javax.swing.*;
import java.awt.*;

public class Orria extends JFrame  {

    private JCheckBox kaxa1, kaxa2;
    private ImageIcon img;

    public void erakutsi() {
        kaxak();
        orria();

    }

    private void orria() {

        setTitle("Ejemplo 10");
        setSize(500, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void kaxak(){
        kaxa1 = new JCheckBox("Katniss");
        kaxa2 = new JCheckBox("Peeta");
        getContentPane().add(kaxa1, BorderLayout.NORTH);
        getContentPane().add(kaxa2, BorderLayout.NORTH);
        add(kaxa1);
        add(kaxa2);

    }

    private void irudiak(){
        ImageIcon icon = new ImageIcon("./berserk.png");
        Image irudia = icon.getImage();
    }


}
