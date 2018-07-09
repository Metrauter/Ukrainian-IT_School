package classworks.lesson7;

public abstract class Shape {
    String colour;
    public Shape() {
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract void drow();
}
