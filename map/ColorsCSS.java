package worldbuilder.map;

/*
 * @author angel 
 * @date Apr 4, 2019
 */
public class ColorsCSS {

    static String[] gray;
    static String[] blue;
    static String[] green;

    public static void initialize() {
        loadGray();
        loadBlue();
        loadGreen();
    }

    private static void loadGray() {
        gray = new String[19];
        gray[0] = "#0d0d0d";
        gray[1] = "#1a1a1a";
        gray[2] = "#262626";
        gray[3] = "#333333";
        gray[4] = "#404040";
        gray[5] = "#4d4d4d";
        gray[6] = "#595959";
        gray[7] = "#666666";
        gray[8] = "#737373";
        gray[9] = "#808080";
        gray[10] = "#8c8c8c";
        gray[11] = "#999999";
        gray[12] = "#a6a6a6";
        gray[13] = "#b3b3b3";
        gray[14] = "#bfbfbf";
        gray[15] = "#cccccc";
        gray[16] = "#d9d9d9";
        gray[17] = "#e6e6e6";
        gray[18] = "#f2f2f2";
    }

    private static void loadBlue() {
        blue = new String[19];
        blue[0] = "00001a";
        blue[1] = "000033";
        blue[2] = "00004d";
        blue[3] = "000066";
        blue[4] = "000080";
        blue[5] = "000099";
        blue[6] = "0000b3";
        blue[7] = "0000cc";
        blue[8] = "0000e6";
        blue[9] = "0000ff";
        blue[10] = "1a1aff";
        blue[11] = "3333ff";
        blue[12] = "4d4dff";
        blue[13] = "6666ff";
        blue[14] = "8080ff";
        blue[15] = "9999ff";
        blue[16] = "b3b3ff";
        blue[17] = "ccccff";
        blue[18] = "e6e6ff";
    }

    private static void loadGreen() {
        green = new String[19];
        green[0] = "051405";
        green[1] = "0a290a";
        green[2] = "0f3d0f";
        green[3] = "145214";
        green[4] = "196619";
        green[5] = "1f7a1f";
        green[6] = "248f24";
        green[7] = "29a329";
        green[8] = "2eb82e";
        green[9] = "33cc33";
        green[10] = "47d147";
        green[11] = "5cd65c";
        green[12] = "70db70";
        green[13] = "85e085";
        green[14] = "99e699";
        green[15] = "adebad";
        green[16] = "c2f0c2";
        green[17] = "d6f5d6";
        green[18] = "ebfaeb";
    }

    public static String getGray(int Brightness) {
        return gray[Brightness];
    }

    public static String getBlue(int Brightness) {
        return blue[Brightness];
    }

    public static String getGreen(int Brightness) {
        return green[Brightness];
    }

}
