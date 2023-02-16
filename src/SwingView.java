package MVCBsp;

import javax.swing.*;
import java.awt.*;

public class SwingView {
    JFrame frame;
    JTextField tfInput, tfOutput;
    JButton button;

    public SwingView() {
        init();
    }

    private void init() {
        //Frame erstellen
        frame = new JFrame("MVC-GUI");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Komponenten anlegen
        tfInput = new JTextField(10);
        tfOutput = new JTextField(10);
        button = new JButton("Hash?");

        //Layout anlegen
        frame.setLayout(new FlowLayout());

        //Komponenten hinzufügen
        frame.add(tfInput);
        frame.add(tfOutput);
        frame.add(button);

        //ActionListener hinzufügen
        button.addActionListener(new SwingController(this));

        //Frame anzeigen
        frame.setVisible(true);
    }

    public void setOutputText(String output) {
        tfOutput.setText(output);
    }

    public String getInputText() {
        return tfInput.getText();
    }
}

