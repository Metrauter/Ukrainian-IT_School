package classworks.lesson7;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shape = new Shape[2];
        shape[0] = new Circle(2, 3, 1);
        shape[1] = new Rectangle(3, 5, 1, 7);
        for (Shape pen : shape) {
            pen.drow();
        }

        Circle circle1 = new Circle(4, 5, 1);
        Circle circle2 = new Circle(4, 5, 1);
        Rectangle rectangle1 = new Rectangle(2, 5, 6, 3);
        Rectangle rectangle2 = new Rectangle(1, 2, 3, 1);

        System.out.println(circle1.equals(circle2));
        System.out.println(rectangle1.equals(rectangle2));

        System.out.println(circle1);
        System.out.println(rectangle1);
    }
}