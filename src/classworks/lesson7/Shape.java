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
}
