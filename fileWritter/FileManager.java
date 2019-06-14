package worldbuilder.fileWritter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;

public class FileManager {

    static Formatter formatter;
    static String filePath;
    static String fileName;

    public static void writeNewLine(String Content) {
        write(Content);
        newLine();
    }

    private static void newLine() {
        write("\n");
    }

    public static void write(String Content) {
        try {
            FileWriter fileWriter = new FileWriter(filePath + fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Content);
            bufferedWriter.close();
            print(filePath + fileName + " written successfully.");
        } catch (Exception e) {
            System.out.println("FileManager: " + e);
            print("Error when attempting to write " + fileName);
        }
    }

    public static void create() {
        String location = filePath + fileName;
        try {
            formatter = new Formatter(location);
            print("File created: " + location + ".");
        } catch (Exception e) {
            print("FileManager.create():" + e);
            print("Error creating file: " + location + ".");
        }
    }

    public static boolean fileExists() {
        File file = new File(filePath + fileName);
        return file.exists();
    }

    public static void setFileName(String FileName) {
        fileName = FileName;
    }

    public static void setFilePath(String FilePath) {
        filePath = FilePath;
    }

    private static void print(String string) {
        System.out.println(string);
    }

}
