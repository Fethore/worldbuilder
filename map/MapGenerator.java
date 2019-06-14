package worldbuilder.map;

import worldbuilder.fileWritter.FileBuilder;
import worldbuilder.output.LogOutputter;
import worldbuilder.patterns.Pattern;
import worldbuilder.patterns.PatternFactory;
import worldbuilder.tools.BiasedRandom;

public class MapGenerator {

    static Map blueMap;
    static Map greenMap;
    static Pointer[] pointers;
    public static int mapHeight;
    public static int mapWidth;

    public static void generate() {
        buildMaps();
        fillBlueMap();
        fillGreenMap();
        createPointers();
        createIslands(1);
        printSize();
    }

    private static void printSize() {
        int width = blueMap.width;
        int height = blueMap.height;
        LogOutputter.writeNewLine("Map Size | Width: " + width + " | Height: " + height);
    }

    private static void buildMaps() {
        blueMap = MapFactory.getMap(mapWidth, mapHeight);
        greenMap = MapFactory.getMap(mapWidth, mapHeight);
    }

    private static void createPointers() {
        int amount = blueMap.getSize() / 1500;
        pointers = new Pointer[amount];
        for (int i = 0; i < amount; i++) {
            setPointer(i);
        }
    }

    private static void setPointer(int index) {
        pointers[index] = new Pointer();
        int x = BiasedRandom.getInt(0, blueMap.width);
        int y = BiasedRandom.getInt(0, blueMap.height);
        pointers[index].x = x;
        pointers[index].y = y;
    }

    private static void createIslands(int size) {
        for (int i = 0; i < pointers.length; i++) {
            Pointer temp = pointers[i];
            Pointer focus = new Pointer();

            //focus on point 
            focus.x = temp.x;
            focus.y = temp.y;

            //move and fill based on pattern
            Pattern p = PatternFactory.getPattern();
            for (int u = 0; u < size; u++) {
                runPattern(focus, p);
            }
        }
    }

    private static void runPattern(Pointer pointer, Pattern pattern) {
        for (int u = 0; u < pattern.moves.length; u++) {
            int move = pattern.moves[u];
            movePointer(pointer, move);
            randomBrush(pointer);
        }
    }

    private static void randomBrush(Pointer pointer) {
        int i = BiasedRandom.getInt(0, 3);
        if (i == 0) {
            smallBrush(pointer);
        } else {
            mediumBrush(pointer);
        }

    }

    private static void smallBrush(Pointer pointer) {
        createTile(pointer);
    }

    private static void mediumBrush(Pointer pointer) {
        smallBrush(pointer);
        pointer.decreseX();
        createTile(pointer);

        pointer.increseX(2);
        createTile(pointer);
        pointer.decreseX();

        pointer.decreseY();
        createTile(pointer);

        pointer.increseY(2);
        createTile(pointer);
        pointer.decreseY();
    }

    private static void createTile(Pointer pointer) {
        int x = pointer.x;
        int y = pointer.y;
        int value = BiasedRandom.getInt(5, 15);
        greenMap.setValue(x, y, value);
    }

    private static void movePointer(Pointer pointer, int move) {
        switch (move) {
            case 0:
                pointer.decreseX();
                break;
            case 1:
                pointer.increseX();
                break;
            case 2:
                pointer.decreseY();
                break;
            case 3:
                pointer.increseY();
                break;
            case 4:
                pointer.random();
                break;
        }
    }

    private static void fillBlueMap() {
        for (int x = 0; x < blueMap.width; x++) {
            for (int y = 0; y < blueMap.height; y++) {
                int value = BiasedRandom.getInt(5, 15);
                blueMap.setValue(x, y, value);
            }
        }
    }

    private static void fillGreenMap() {
        for (int x = 0; x < blueMap.width; x++) {
            for (int y = 0; y < blueMap.height; y++) {
                greenMap.setValue(x, y, 0);
            }
        }
    }

    public static void createStyle() {
        String style = "<style>";
        style += " * { padding: 0px; margin: 0px; }";
        style += " html { background-color: lightblue; }";
        style += " button { height: 5px; width: 5px; border: 0px solid black; }";
        style += " button:hover { border-radius: 10px; }";
        style += "</style>";
        FileBuilder.append(style);
    }

    public static void convertToHTML() {
        FileBuilder.append("</br><center>");
        for (int y = 0; y < blueMap.height; y++) {
            FileBuilder.append("<div>");
            for (int x = 0; x < blueMap.width; x++) {
                int value = greenMap.getValue(x, y);
                if (value > 0) {
                    String tile = MapTileFactory.getGreenTile(4);
                    FileBuilder.append(tile);
                } else {
                    String tile = MapTileFactory.getBlueTile(10);
                    FileBuilder.append(tile);
                }
            }
            FileBuilder.append("</div>");
        }
        FileBuilder.append("</center>");
    } //please refactor this monster.

}
