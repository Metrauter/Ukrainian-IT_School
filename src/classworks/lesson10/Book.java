package classworks.lesson10;

public class Book implements Printable {
    private String name;

    public static void printBooks(Printable[] printables){

        for (Printable p : printables) {
            if (p instanceof Book) {
                Book book = (Book) p;
                System.out.println(book.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {

        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю книгу: "+ getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return getName().equals(book.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}