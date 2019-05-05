package worldbuilder.patterns;

import worldbuilder.random.BiasedRandom;

/*
 * @author angel 
 * @date Apr 5, 2019
 */
public class PatternFactory {

    public static Pattern getPattern() {
        Pattern p = new Pattern(800);
        for (int i = 0; i < p.moves.length; i++) {
            p.moves[i] = BiasedRandom.getInt(0, 4);
        }
        return p;
    }

}
