package worldbuilder.map;

import worldbuilder.tools.BiasedRandom;

public class Pointer {

    public int x;
    public int y;

    public void increseX() {
        x++;
    }

    public void decreseX() {
        x--;
    }

    public void increseY() {
        y++;
    }

    public void decreseY() {
        y--;
    }

    public void increseX(int amount) {
        x += amount;
    }

    public void decreseX(int amount) {
        x -= amount;
    }

    public void increseY(int amount) {
        y += amount;
    }

    public void decreseY(int amount) {
        y -= amount;
    }

    public void random() {
        switch (BiasedRandom.getInt(0, 3)) {
            case 0:
                increseX();
                break;
            case 1:
                decreseX();
                break;
            case 2:
                increseY();
                break;
            case 3:
                decreseY();
                break;
        }
    }
}
