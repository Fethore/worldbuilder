package worldbuilder.map;

/*
 * @author angel 
 * @date Apr 4, 2019
 */
public class MapTileFactory {

    public static String getGrayTile(int value) {
        String color = ColorsCSS.getGray(value);
        String Tile = "<button style=' background-color: " + color + "; '>";
        return Tile;
    }

    public static String getBlueTile(int value) {
        String color = ColorsCSS.getBlue(value);
        String Tile = "<button style=' background-color: " + color + "; '>";
        return Tile;
    }
    
     public static String getGreenTile(int value) {
        String color = ColorsCSS.getGreen(value);
        String Tile = "<button style=' background-color: " + color + "; '>";
        return Tile;
    }
}
