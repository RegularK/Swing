package MVCBsp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingController implements ActionListener {

    private SwingModel model;
    private SwingView view;

    public SwingController(SwingView view){
        this.view = view;
        this.model = new SwingModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setOutputText(model.getHashedText(view.getInputText()));
    }
}
