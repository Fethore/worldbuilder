package worldbuilder.output;

public class LogOutputter {

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
