package classworks.lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 25.4;
        Double double2 = new Double("25.3");

        Double double3 = 3.3;
        Double double4 = Double.valueOf("4.5");

        double double5 = Double.parseDouble("1.3");

        String d = Double.toString(3.14);

        System.out.println(double1 + " " + double2);
        System.out.println(double3 + " " + double4);
        System.out.println(double5);
        System.out.println(d);
        System.out.println(double4.byteValue());
        System.out.println(double4.floatValue());
        System.out.println(double4.intValue());
        System.out.println(double4.longValue());
        System.out.println(double4.shortValue());
    }
}
