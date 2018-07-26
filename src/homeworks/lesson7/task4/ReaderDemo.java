package homeworks.lesson7.task4;

public class ReaderDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Кондратюк В.К.");
        Book book2 = new Book("Энциклопедия", "Васильев И.М.");
        Book book3 = new Book("Словарь", "Русскин Е.С.");

        Reader reader1 = new Reader("Иванов В.П.", "12.03.1975", "0958574636", 2, 1);
        Reader reader2 = new Reader("Болотов И.К.", "1.06.1971", "0634759647", 34, 3);
        Reader reader3 = new Reader("Килянов С.В.", "26.03.1983", "0636435687", 25, 2);

        reader1.takeBook(3);
        reader2.takeBook("Азбука", "Грамматика", "Орфография");
        reader1.returnBook(2);
        reader2.returnBook("Азбука", "Грамматика");
        reader3.takeBook(book3);
        reader3.returnBook(book2);
    }
}
