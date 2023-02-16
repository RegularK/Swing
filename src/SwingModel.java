package MVCBsp;

public class SwingModel {

    public String getHashedText(String textInput) {
        String textOutput = String.valueOf(textInput.hashCode());
        return textOutput;
    }

}
