package worldbuilder.fileWritter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import worldbuilder.log.LogOutputter;

/*
 * @author angel 
 * @date Apr 4, 2019
 */
public class FileManager {

    static Formatter formatter;
    static String filePath;
    static String fileName;

    public static void writeNewLine(String Content) {
        write(Content);
        newLine();
    }

    public static void newLine() {
        write("\n");
    }

    public static void write(String Content) {
        try {
            FileWriter fileWriter = new FileWriter(filePath + fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Content);
            bufferedWriter.close();
            LogOutputter.writeNewLine("File written successfully.");
        } catch (Exception e) {
            LogOutputter.writeNewLine("Error writing to file.");
        }
    }

    public static void create() {
        String location = filePath + fileName;
        try {
            formatter = new Formatter(location);
            LogOutputter.writeNewLine("File created: " + location + ".");
        } catch (Exception e) {
            LogOutputter.writeNewLine("Error creating file: " + location + ".");
        }
    }
    
    public static boolean fileExists(){
        File file = new File(filePath + fileName);
        return file.exists();
    }

    public static void setFileName(String FileName) {
        fileName = FileName;
    }

    public static void setFilePath(String FilePath) {
        filePath = FilePath;
    }

}
