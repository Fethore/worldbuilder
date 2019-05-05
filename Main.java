package worldbuilder;

import worldbuilder.fileWritter.FileBuilder;
import worldbuilder.fileWritter.FileManager;
import worldbuilder.map.ColorsCSS;
import worldbuilder.log.LogOutputter;
import worldbuilder.map.MapGenerator;
import worldbuilder.random.BiasedRandom;

/*
 * @author angel 
 * @date Apr 3, 2019
 */
public class Main {

    static String mapName;

    public static void initialize() {
        LogOutputter.initialize();
        ColorsCSS.initialize();
        BiasedRandom.initialize();
        FileBuilder.initialize();
    }

    public static void run() {
        createFile();
        write("Generating map.");
        generateMap();
        FileBuilder.writeFile();
        write("Map generated successfully.");
        FileBuilder.clear();
    }

    public static void setMapName(String Name) {
        if (Name.equals("")) {
            mapName = "map";
        } else {
            mapName = Name;
        }
        checkName();
        write("MapName set to: " + mapName + ".html.");
    }
    
    private static void checkName(){
        // TODO increment default file name based on currently existing files.
        // probably a for loop cheking if a name exists until an open name slot is open and then used.
    }

    public static void setMapSize(String Size) {
        write("-------------------" + Size + " Map");
        MapGenerator.mapSize = Size;
    }
    
    private static void generateMap(){
        MapGenerator.generate();
        MapGenerator.createStyle();
        MapGenerator.convertToHTML();
    }

    private static void createFile() {
        FileManager.setFileName(mapName + ".html"); 
        FileManager.setFilePath("");
        FileManager.create();
    }

    private static void write(String string) {
        LogOutputter.writeNewLine(string);
    }
}
