package worldbuilder.log;

import javax.swing.JTextArea;

/*
 * @author angel 
 * @date Apr 4, 2019
 */
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
