package classworks.lesson7;

public abstract class Shape {
    private String colour;

    public Shape() {
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {

        return colour;
    }

    public abstract void drow();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        return getColour().equals(shape.getColour());
    }

    @Override
    public int hashCode() {
        return getColour().hashCode();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
