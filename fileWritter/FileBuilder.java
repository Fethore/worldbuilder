package worldbuilder.fileWritter;

import worldbuilder.output.OutputString;

public class FileBuilder {

    static OutputString outputString;

    public static void initialize() {
        outputString = new OutputString();
    }

    public static void append(String Content) {
        outputString.append(Content);
    }

    public static void writeFile() {
        FileManager.write(outputString.output);
    }

    public static void clear() {
        outputString.clear();
    }
}
