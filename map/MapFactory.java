package worldbuilder.map;

/*
 * @author angel 
 * @date Apr 3, 2019
 */
public class MapFactory {
    
    public static Map megaMap() {
        return new Map(377, 233);
    }
    
    public static Map largeMap() {
        return new Map(233, 144);
    }

    public static Map mediumMap() {
        return new Map(144, 89);
    }
    
    public static Map smallMap() {
        return new Map(89, 55);
    }
    
    public static Map tinyMap() {
        return new Map(55, 34);
    }

}
