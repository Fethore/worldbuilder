package worldbuilder;

import worldbuilder.fileWritter.FileBuilder;
import worldbuilder.fileWritter.FileManager;
import worldbuilder.map.ColorsCSS;
import worldbuilder.map.MapGenerator;
import worldbuilder.output.LogOutputter;
import worldbuilder.tools.BiasedRandom;
import worldbuilder.tools.StringConverter;

public class Main {

    public static String mapName;
    public static String mapHeight;
    public static String mapWidth;

    public static void initialize() {
        LogOutputter.initialize();
        ColorsCSS.initialize();
        BiasedRandom.initialize();
        FileBuilder.initialize();
    }

    public static void run() {
        setMapName();
        createFile();
        setMapSize();
        generateMap();
        FileBuilder.writeFile();
        FileBuilder.clear();
    }

    private static void setMapName() {
        if (mapName.equals("")) {
            mapName = "map";
        }
        LogOutputter.writeNewLine("Map name set to: " + mapName);
    }

    private static void setMapSize() {
        MapGenerator.mapWidth = StringConverter.toInt(mapWidth);
        MapGenerator.mapHeight = StringConverter.toInt(mapHeight);
    }

    private static void generateMap() {
        MapGenerator.generate();
        MapGenerator.createStyle();
        MapGenerator.convertToHTML();
    }

    private static void createFile() {
        FileManager.setFileName(mapName + ".html");
        FileManager.setFilePath("");
        if (FileManager.fileExists()) {
            FileManager.create();
            print("file created");
        }
    }

    private static void print(String string) {
        System.out.println(string);
    }
}
