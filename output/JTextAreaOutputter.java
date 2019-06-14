package worldbuilder.output;

import javax.swing.JTextArea;

public class JTextAreaOutputter {

    static JTextArea outputJTextField;

    public static void setJTextField(JTextArea OutputJTextAreas) {
        outputJTextField = OutputJTextAreas;
    }

    public static void refreshJTextArea() {
        String output = LogOutputter.getOutput();
        outputJTextField.setText(output);
    }

}
