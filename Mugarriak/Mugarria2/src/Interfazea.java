import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class Interfazea extends JFrame implements ActionListener {

    private JComboBox aukeraKAXA;
    private JPanel p1, p2;
    private BufferedReader br1;
    private JButton b1, b2;
    private JTextArea ta1;
    private JScrollPane sp1;

    public static void main(String[] args) {

        new Interfazea().erakutxi();

    }

    public void erakutxi(){
        aukera();
        textua();
        orria();
    }

    private void orria(){
        setTitle("Mugarria 2");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void aukera(){
        p1= new JPanel (new FlowLayout(FlowLayout.CENTER));
        p1.setPreferredSize(new Dimension(400,500));

        String[] arrayFITXA = {"Java","Python","C",};

        aukeraKAXA= new JComboBox(arrayFITXA);
        aukeraKAXA.setPreferredSize(new Dimension(250,25));
        aukeraKAXA.addActionListener(this);

        b1= new JButton("Clear");
        b1.addActionListener(this);

        p1.add(aukeraKAXA);
        p1.add(b1);

        add(p1, BorderLayout.CENTER);
    }

    private void textua(){
        p2= new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.setPreferredSize(new Dimension(400,500));

        ta1= new JTextArea();
        ta1.setLineWrap(true);

        sp1= new JScrollPane(ta1);
        sp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sp1.setPreferredSize(new Dimension(390,400));

        b2= new JButton("Close");
        b2.addActionListener(this);

        p2.add(sp1);
        p2.add(b2);

        add(p2, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            ta1.setText("");
            String datuak=null;
            if (e.getSource() == aukeraKAXA) {
                String autatutakoAUKERA = (String) aukeraKAXA.getSelectedItem();
                if (autatutakoAUKERA.equals("Java")) {
                    br1 = new BufferedReader(new FileReader(".\\java.txt"));

                } else if (autatutakoAUKERA.equals("Python")) {
                    br1 = new BufferedReader(new FileReader(".\\python.txt"));

                } else if (autatutakoAUKERA.equals("C")) {
                    br1 = new BufferedReader(new FileReader(".\\c.txt"));
                }

                while ((datuak=br1.readLine()) != null){
                    ta1.append(datuak+"\n");
                }
                br1.close();
            }
            if (e.getSource()== b1){
                ta1.setText("");
            }
        }catch (FileNotFoundException ex) {
            JOptionPane.showConfirmDialog(null,"Fitxategia ez da existitzen", "Errorea", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}

