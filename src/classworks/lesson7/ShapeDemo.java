package classworks.lesson7;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shape = new Shape[2];
        shape[0] = new Circle(2, 3, 1);
        shape[1] = new Rectangle(3, 5, 1, 7);
        for (Shape pen : shape) {
            pen.drow();
        }
    }
}

