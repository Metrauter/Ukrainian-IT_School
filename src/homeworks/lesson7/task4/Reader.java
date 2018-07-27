package homeworks.lesson7.task4;

public class Reader {
    private String name, dateBirthday, phoneNumber;
    private int numberBilet, facultet;

    Reader(String name, String dateBirthday, String phoneNumber, int numberBilet, int facultet) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.phoneNumber = phoneNumber;
        this.numberBilet = numberBilet;
        this.facultet = facultet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberBilet() {
        return numberBilet;
    }

    public void setNumberBilet(int numberBilet) {
        this.numberBilet = numberBilet;
    }

    public int getFacultet() {
        return facultet;
    }

    public void setFacultet(int facultet) {
        this.facultet = facultet;
    }

    public void takeBook() {
    }

    void takeBook(int c) {
        System.out.println(getName() + " взял " + c + " книг");
    }

    void takeBook(String... books) {
        System.out.println(getName() + " взял кинги: ");
        for (String n : books) {
            System.out.println(n + " ");
        }
        System.out.println();
    }

    void takeBook(Book b) {
        System.out.println(getName() + " взял кинги: " + b.getBookName());
    }

    void returnBook(int c) {
        System.out.println(getName() + " вернул " + c + " книги");
    }

    public void returnBook(String... books) {
        System.out.println(getName() + " вернул кинги: ");
        for (String n : books) {
            System.out.println(n + " ");
        }
    }

    public void returnBook(Book... b) {
        for (Book n : b) {
            System.out.println(n + " ");
            System.out.println(getName() + " вернул кинги: " + n.getBookName());
        }
    }
}