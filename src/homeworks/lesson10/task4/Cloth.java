package homeworks.lesson10.task4;

import java.util.Objects;

public abstract class Cloth {
    int size;
    double price;
    String colour;

    public Cloth(int size, double price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cloth)) return false;
        Cloth cloth = (Cloth) o;
        return getSize() == cloth.getSize() &&
                Double.compare(cloth.getPrice(), getPrice()) == 0 &&
                Objects.equals(getColour(), cloth.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getPrice(), getColour());
    }
}
