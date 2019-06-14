package worldbuilder.tools;

import java.util.Random;

public class BiasedRandom {

    static Random random;
    static float bias;

    public static void initialize() {
        random = new Random();
        bias = 0;
    }

    public static void setRandomBias() {
        bias = getFloat();
    }

    public static void resetBias() {
        bias = 0;
    }

    public static float getFloat() {
        return random.nextFloat() + bias;
    }

    public static int getInt(int Minimum, int Maximum) {
        return random.nextInt(Maximum - Minimum) + Minimum;
    }

}
