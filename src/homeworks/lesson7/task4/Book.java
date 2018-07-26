package homeworks.lesson7.task4;

public class Book {
    private String bookName, authorName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

