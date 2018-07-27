package classworks.lesson7;

public class Circle extends Shape {

    private double a, b, d;


    public Circle(double a, double b, double d) {
        this.setColour("красного");
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

    public void drow() {
        System.out.println("Рисую круг " + getColour() + " цвета " + "c координатами " + getA()
                + " " + getB() + " и диаметром " + getD());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.getA(), getA()) != 0) return false;
        if (Double.compare(circle.getB(), getB()) != 0) return false;
        return Double.compare(circle.getD(), getD()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getA());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getD());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                ", d=" + d +
                "} " + super.toString();
    }
}
