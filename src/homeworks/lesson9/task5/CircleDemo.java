package homeworks.lesson9.task5;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(13.2);
        Circle circle2 = new Circle(11.6);
        Circle circle3 = new Circle(17.9);

        Circle[] circles = {circle1, circle2, circle3};
        for (Circle circle : circles){
            circle.area();
            circle.length();
        }
    }
}
