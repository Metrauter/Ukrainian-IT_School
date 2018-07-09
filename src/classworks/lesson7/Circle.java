package classworks.lesson7;

public class Circle extends Shape{
    double a;
    double b;
    double d;

    public Circle(double a, double b, double d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String drow() {
        System.out.println("Рисую круг " + getColour() + " цвета " + "c координатами " + getA() + " " + getB() + " и диаметром " + getD());
    return a*b*d;
    }
}
