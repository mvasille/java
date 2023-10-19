package java6prac.printable;

public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Book 1");
        printableItems[1] = new Shop("Shop 1");
        printableItems[2] = new Book("Book 2");
        printableItems[3] = new Shop("Shop 2");

        for (Printable item : printableItems) {
            item.print();
        }
    }
}
