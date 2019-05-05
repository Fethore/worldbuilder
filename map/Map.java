package worldbuilder.map;

/*
 * @author angel 
 * @date Apr 3, 2019
 */
public class Map {

    private int[][] values;
    public int height;
    public int width;

    public Map(int Width, int Height) {
        values = new int[Width][Height];
        height = Height;
        width = Width;
    }

    public int getSize() {
        return height * width;
    }

    public int getValue(int X, int Y) {
        return values[X][Y];
    }

    public void setValue(int X, int Y, int Value) {
        if (X < width && X >= 0 && Y < height && Y > 0) {
            values[X][Y] = Value;
        }
    }
}
