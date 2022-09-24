package TemplateMode;

public class StringDisplay extends AbstractDisplay {
    private final String string;
    private final int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
