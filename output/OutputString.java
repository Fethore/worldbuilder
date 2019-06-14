package worldbuilder.output;

public class OutputString {

    public String output;

    public OutputString() {
        output = "";
    }

    public void append(String Content) {
        output += Content;
    }

    public void appendNewLine(String Content) {
        output += Content + "\n";
    }

    public void newLine() {
        output += "\n";
    }

    public void print() {
        System.out.println(output);
    }

    public void clear() {
        output = "";
    }

}
