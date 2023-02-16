package MVCBsp;

import javax.swing.*;

public class SwingMVC {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingView();
            }
        });
    }
}
