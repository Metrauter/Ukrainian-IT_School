package classworks.lesson7;

public class Rectangle extends Shape {
    double x;
    double x1;
    double y;

    public Rectangle(double x, double x1, double y, double y1) {
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y1;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    double y1;

    public String drow() {
        System.out.println("Рисую круг " + getColour() + " цвета " + "c координатами " + getA() + " " + getB() + " и диаметром " + getD());
    }
}
