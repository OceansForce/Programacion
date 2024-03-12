import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends JFrame {
        //Sorrera
        JFrame frame = new JFrame("FrameDemo");
//Ixterakoan duen portaera
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Tamaina esleitzea
        frame.setPreferredSize(new Dimension(300, 200));
        JLabel etiketa = new JLabel("Kaixo");
        frame.getContentPane().add(etiketa, BorderLayout.CENTER);
//Bistaratzea
        frame.pack();
        frame.setVisible(true);
    }
