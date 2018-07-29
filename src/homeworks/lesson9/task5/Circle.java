package homeworks.lesson9.task5;

import java.util.Objects;

public class Circle {
    double radius;
    public static final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println(PI * radius * radius);
    }

    public void length() {
        System.out.println(2 * PI * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
