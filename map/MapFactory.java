package worldbuilder.map;

public class MapFactory {

    public static Map getMap(int Width, int Heigtht) {
        return new Map(Width, Heigtht);
    }

}
