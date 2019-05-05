package worldbuilder.log;

import worldbuilder.fileWritter.OutputString;

/*
 * @author angel 
 * @date Apr 4, 2019
 */
public class LogOutputter {
    // bridge between JTextAreaOutputter and the other classes

    static OutputString outputString;

    public static void initialize() {
        outputString = new OutputString();
    }

    public static String getOutput() {
        return outputString.output;
    }

    public static void writeNewLine(String LogText) {
        outputString.appendNewLine(LogText);
        JTextAreaOutputter.refreshJTextArea();
    }

    public static void write(String LogText) {
        outputString.append(LogText);
        JTextAreaOutputter.refreshJTextArea();
    }

}
