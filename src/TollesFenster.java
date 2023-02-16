import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TollesFenster {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Dies ist ein tolles Fenster");
        fenster.setSize(500,300);
        JPanel panel = new JPanel();
        JLabel eingabeLabel = new JLabel("Was passiert jetzt?");
        JTextField eingabeFeld = new JTextField(20);
        JLabel ausgabeLabel = new JLabel("Was passiert jetzt?");
        JTextField ausgabeFeld = new JTextField(20);
        JButton tollerButton = new JButton("Abfahrt!");

        tollerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eingabe = eingabeFeld.getText();
                int ausgabe = eingabe.hashCode();
                ausgabeFeld.setText(String.valueOf(ausgabe));

            }
        });

        panel.add(eingabeLabel);
        panel.add(eingabeFeld);
        panel.add(ausgabeLabel);
        panel.add(ausgabeFeld);
        panel.add(tollerButton);

        panel.setLayout(new GridLayout(5,1));
        fenster.add(panel);
        fenster.setVisible(true);
        new FarbenUndTiere();
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}