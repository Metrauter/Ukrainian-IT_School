package homeworks.lesson7.task3;


public class MatrixDemo {
    public static void main(String[] args) {
        Matrix a = new Matrix(4, 4);
        a.fillRandom();
        a.print("a");

        Matrix b = new Matrix(4, 4);
        b.fillRandom();
        b.print("b");

        Matrix c = a.add(b);
        c.print("c");

        Matrix d = a.multiply(3);
        d.print("d");

        Matrix e = a.multiply(b);
        e.print("e");
    }
}
