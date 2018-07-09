package classworks.lesson7;

public abstract class Shape {
    public Shape() {
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    String colour;

    public abstract String drow();
}
