package classworks.lesson7;

public class Rectangle extends Shape {
    private double x1, x2, y1, y2;

    public Rectangle(double x1, double x2, double y1, double y2) {
        this.setColour("зелёного");
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    private double getX1() {

        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void drow() {
        System.out.println("Рисую квадрат " + getColour() + " цвета " + "c координатами " + getX1() + " " + getX2() + " " +
                getY1() + " " + getY2());
    }
}
