import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Orria extends JFrame  {

    private JCheckBox kaxa1, kaxa2;
    private ImageIcon img;

    public void erakutsi() {
        kaxak();
        orria();
    }

    private void orria() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 10"); //Título del JFrame
        setSize(500, 250); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    private void kaxak(){
        kaxa1 = new JCheckBox("Katniss");
        kaxa1.setBounds(230,0,150,30);
        getContentPane().add(kaxa1, BorderLayout.CENTER);
        add(kaxa1);

        kaxa2 = new JCheckBox("Peeta");
        getContentPane().add(kaxa2, BorderLayout.CENTER);
        kaxa2.setBounds(170,0,150,30);

        add(kaxa2);
    }

    private void irudiak(){
        ImageIcon icon = new ImageIcon("./berserk.png");
        Image irudia = icon.getImage();
    }


}
