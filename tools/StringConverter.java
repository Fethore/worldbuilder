package worldbuilder.tools;

public class StringConverter {

    public static int toInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("StringConverter: " + e);
            return 0;
        }
    }

}
