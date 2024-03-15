import javax.swing.*;
import java.awt.*;

public class Orria extends JFrame  {

    private JCheckBox kaxa1, kaxa2;
    private JPanel p1;
    private JPanel p2;
    public void erakutsi() {
        kaxak();
        zentroa();
        orria();

    }

    private void orria() {

        setTitle("Ejemplo 10");
        setSize(500, 250);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void kaxak(){

        p1=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        kaxa1 = new JCheckBox("Katniss");
        kaxa2 = new JCheckBox("Peeta");

        p1.add(kaxa1);
        p1.add(kaxa2);
        p1.setBackground(Color.BLUE);

        add(p1, BorderLayout.NORTH);
    }

    private void zentroa(){
        p2= new JPanel();
        p2.setLayout(new GridLayout(2,2));
        ImageIcon icon = new ImageIcon(".\\distancia-pecoreo-abejas.png");

        p2.add(new JLabel(icon));
        p2.setBackground(Color.RED);
        add(p2, BorderLayout.CENTER);

    }



}
