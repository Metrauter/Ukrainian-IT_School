package homeworks.lesson10.task4;

public class Skirt extends Cloth implements WomanCloth {
    public Skirt(int size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void clotheWoman() {
        System.out.println("Одеваем юбку на женщину " + getColour() + " цвета " + getSize() +
                " размера, стоимостью " + getPrice());
    }
}
