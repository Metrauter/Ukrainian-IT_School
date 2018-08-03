package classworks.lessons12;

public class StringDemo {
    public static void main(String[] args) {
        String n = "I like Java!!!";

        print(n);
        getLastChar(n);
        getPosition(n);
        replace(n);
        cut(n);
    }

    private static void print(String n) {
        System.out.println(n.endsWith("!!!"));
        System.out.println(n.startsWith("I like"));
    }

    private static void getLastChar(String a) {
        System.out.println(a.charAt(a.length() - 1));
    }

    private static void getPosition(String b) {
        System.out.println("indexOf(Java) = "
                + b.indexOf("Java"));
        System.out.println("lastIndexOf(Java) = "
                + b.lastIndexOf("Java"));
    }

    private static void replace(String c) {
        System.out.println(c.replace('a', 'o'));
        System.out.println(c.toUpperCase());
        System.out.println(c.toLowerCase());
    }

    private static void cut(String d) {
        System.out.println(d.substring(7, 11));
    }
}
