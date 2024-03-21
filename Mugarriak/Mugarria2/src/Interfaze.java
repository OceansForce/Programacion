import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaze extends JFrame
{
    private double emaitza = 0;
    private int eragiketa = -1; // 0 -> Batuketa, 1 -> Kenketa, 2 -> Biderketa, 3 -> Zatiketa, -1 -> Eragiketarik ez

    private boolean garbitu = true;

    JTextArea emaitza_eremu;


    public static void main(String[] args)
    {

        new Interfaze().sortuInterfazea();
    }

    private void sortuInterfazea()
    {
        setLayout(new GridLayout(2,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(650, 300));
        setTitle("Kalkulagailua");

        add(prestatuGoiEzker());

        add(prestatuGoiEskuin());

        add(prestatuBeheEzker());

        //pack();
        setVisible(true);
    }

    private JPanel prestatuGoiEzker()
    {
        JPanel gEzker = new JPanel(new GridLayout(4,3));

        JButton botoi_garbitu = new JButton("AC");
        botoi_garbitu.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                eragiketa = -1;
                emaitza = 0;
                emaitza_eremu.setText("0");
            }
        });
        gEzker.add(botoi_garbitu);

        for (int i = 0; i < 10; i++)
        {
            JButton zenbakiBotoi = new JButton(String.valueOf(i));
            zenbakiBotoi.addActionListener(new ZenbakiEntzule());
            gEzker.add(zenbakiBotoi);
        }

        JButton botoi_berdin = new JButton("=");
        botoi_berdin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double zenbaki;
                switch (eragiketa)
                {
                    case 0:
                        zenbaki = emaitza + Double.parseDouble(emaitza_eremu.getText());
                        emaitza_eremu.setText(String.valueOf(zenbaki));
                        break;
                    case 1:
                        zenbaki = emaitza - Double.parseDouble(emaitza_eremu.getText());
                        emaitza_eremu.setText(String.valueOf(zenbaki));
                        break;
                    case 2:
                        zenbaki = emaitza * Double.parseDouble(emaitza_eremu.getText());
                        emaitza_eremu.setText(String.valueOf(zenbaki));
                        break;
                    case 3:
                        if (Double.parseDouble(emaitza_eremu.getText()) == 0)
                        {
                            emaitza_eremu.setText(String.valueOf("Ezin da zati 0 egin"));
                        }
                        else
                        {
                            zenbaki = emaitza / Double.parseDouble(emaitza_eremu.getText());
                            emaitza_eremu.setText(String.valueOf(zenbaki));
                        }
                        break;
                    default:
                        emaitza_eremu.setText("Eragiketa okerra");
                }
                eragiketa = -1;
            }
        });
        gEzker.add(botoi_berdin);

        return gEzker;
    }

    private JPanel prestatuGoiEskuin()
    {
        JPanel gEskuin = new JPanel();
        gEskuin.setLayout(new BoxLayout(gEskuin, BoxLayout.Y_AXIS));

        JLabel et_emaitza = new JLabel("EMAITZA:");
        et_emaitza.setAlignmentX(Component.LEFT_ALIGNMENT);
        et_emaitza.setOpaque(true);
        gEskuin.add(et_emaitza);

        emaitza_eremu = new JTextArea();
        emaitza_eremu.setAlignmentX(Component.LEFT_ALIGNMENT);
        emaitza_eremu.setEditable(false);
        emaitza_eremu.setBackground(Color.WHITE);
        emaitza_eremu.setBorder(new LineBorder(Color.BLACK));
        Font letraMota = emaitza_eremu.getFont();
        emaitza_eremu.setFont(new Font(letraMota.getFontName(), letraMota.getStyle(), 18));
        emaitza_eremu.setText(String.valueOf(emaitza));
        gEskuin.add(emaitza_eremu);

        return gEskuin;
    }

    private JPanel prestatuBeheEzker()
    {
        JPanel bEzker = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton botoi_batu = new JButton("+");
        botoi_batu.setPreferredSize(new Dimension(50,50));
        botoi_batu.addActionListener(new EragiketaEntzule());
        bEzker.add(botoi_batu);

        JButton botoi_kendu = new JButton("-");
        botoi_kendu.setPreferredSize(new Dimension(50,50));
        botoi_kendu.addActionListener(new EragiketaEntzule());
        bEzker.add(botoi_kendu);

        JButton botoi_bidertu = new JButton("*");
        botoi_bidertu.setPreferredSize(new Dimension(50,50));
        botoi_bidertu.addActionListener(new EragiketaEntzule());
        bEzker.add(botoi_bidertu);

        JButton botoi_zatitu = new JButton("/");
        botoi_zatitu.setPreferredSize(new Dimension(50,50));
        botoi_zatitu.addActionListener(new EragiketaEntzule());
        bEzker.add(botoi_zatitu);

        return bEzker;
    }

    class ZenbakiEntzule implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton zenbakiBotoi = (JButton) e.getSource();
            if (garbitu)
            {
                emaitza_eremu.setText(zenbakiBotoi.getText());
                garbitu = false;
            }
            else
            {
                emaitza_eremu.setText(emaitza_eremu.getText() + zenbakiBotoi.getText());
            }
        }
    }

    class EragiketaEntzule implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            garbitu = true;
            emaitza = Double.parseDouble(emaitza_eremu.getText());
            JButton eragiketaBotoi = (JButton) e.getSource();
            if (eragiketaBotoi.getText().equals("+"))
            {
                eragiketa = 0;
            }
            else if (eragiketaBotoi.getText().equals("-"))
            {
                eragiketa = 1;
            }
            else if (eragiketaBotoi.getText().equals("*"))
            {
                eragiketa = 2;
            }
            else
            {
                eragiketa = 3;
            }
        }
    }

}
