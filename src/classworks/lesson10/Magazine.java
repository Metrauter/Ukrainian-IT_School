package classworks.lesson10;

public class Magazine implements Printable {
    private String name;

    public static void printMagazines(Printable[] printables) {

        for (Printable p : printables) {
            if (p instanceof Magazine) {
                Magazine magazine = (Magazine) p;
                System.out.println(magazine.getName());
            }
        }
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю журнал: " + getName());
    }

}
