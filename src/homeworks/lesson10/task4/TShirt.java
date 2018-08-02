package homeworks.lesson10.task4;

public class TShirt extends Cloth implements ManCloth, WomanCloth {
    public TShirt(int size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void clotheMan() {
        System.out.println("Одеваем футболку на мужчину " + getColour()
                + " цвета " + getSize() + " размера, стоимостью " + getPrice());
    }

    @Override
    public void clotheWoman() {
        System.out.println("Одеваем футболку на женщину " + getColour() +
                " цвета " + getSize() + " размера, стоимостью " + getPrice());
    }
}
