import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.color.ColorSpace;

public class Orria extends JFrame  {

    private JCheckBox kaxa1, kaxa2;
    private JRadioButton rb1, rb2, rb3;
    private JPanel p1, p2, p3, p4;

    public void erakutsi() {
        kaxak();
        irudiak();
        radiobutton();
        orria();
    }

    private void orria() {

        setTitle("Ejemplo 10");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void kaxak(){
        p1= new JPanel(new FlowLayout(FlowLayout.CENTER));
        kaxa1 = new JCheckBox("Katniss");
        kaxa2 = new JCheckBox("Peeta");
        p1.add(kaxa1);
        p1.add(kaxa2);

        add(p1, BorderLayout.NORTH);
    }

    private void irudiak(){
        p2= new JPanel(new GridLayout(2,2 ));
        ImageIcon icon = new ImageIcon(".\\a1.png");
        JLabel jl1= new JLabel(icon);
        JLabel jl2= new JLabel(icon);
        JLabel jl3= new JLabel(icon);
        JLabel jl4= new JLabel(icon);
        p2.add(jl1);
        p2.add(jl2);
        p2.add(jl3);
        p2.add(jl4);
        add(p2, BorderLayout.CENTER);
    }

    private void radiobutton(){
        p3= new JPanel();
        p3.setSize(0,250);

        rb1= new JRadioButton("OPT 1", true);
        rb1.setPreferredSize(new Dimension(60, 30));
        rb2= new JRadioButton("OPT 2");
        rb2.setPreferredSize(new Dimension(60, 30));
        rb3= new JRadioButton("OPT 3");
        rb3.setPreferredSize(new Dimension(60, 30));
        JRadioButton[] rb= {rb1, rb2, rb3};

        for (int i=0 ; i<rb.length; i++) {
            p3.add(rb[i]);
        }


        add(p3, BorderLayout.EAST);
    }



}
