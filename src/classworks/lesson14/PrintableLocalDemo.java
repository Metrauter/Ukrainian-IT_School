package classworks.lesson14;

/**
 * Created by Student on 13.08.2018.
 */
public class PrintableLocalDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Anonymous class");
            }
        };
        printable.print();
    }
}

