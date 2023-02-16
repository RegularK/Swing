import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarbenUndTiere extends JFrame {
    private JPanel panel1;

    private JPanel panelMain;
    private JLabel label;
    private JRadioButton gelbRadioButton;
    private JRadioButton blauRadioButton;
    private JRadioButton rotRadioButton;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton fuuuuuuusiiioooooooooonButton;

    public FarbenUndTiere() {
        fuuuuuuusiiioooooooooonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String farbe = null;
                if (rotRadioButton.isSelected()) {
                    farbe = "Rot";
                } else if (blauRadioButton.isSelected()) {
                    farbe = "Blau";
                } else if (gelbRadioButton.isSelected()) {
                    farbe = "Gelb";
                }

                String tier = (String) comboBox1.getSelectedItem();
                String ausgabeText = "Deine Lieblingsfarbe ist "+farbe+" und dein Lieblingstier ist "+tier;
                textField1.setText(ausgabeText);
            }
        });
    }

    public static void main(String[] args) {
        FarbenUndTiere fenster = new FarbenUndTiere();
        fenster.setContentPane(fenster.panel1);
        fenster.setTitle("Farben und Tiere");
        //fenster.setSize(400,500);
        fenster.pack();
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
