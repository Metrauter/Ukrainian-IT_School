package classworks.lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] printables = {new Book("Азбука"), new Magazine("Ешко")};
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
