package homeworks.lesson10.task4;

public class Pants extends Cloth implements ManCloth, WomanCloth {

    public Pants(int size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void clotheMan() {
        System.out.println("Одеваем штаны на мужчину " + getColour() + " цвета " + getSize() +
                " размера, стоимостью " + getPrice());
    }

    @Override
    public void clotheWoman() {
        System.out.println("Одеваем штаны на женщину " + getColour() + " цвета " + getSize() +
                " размера, стоимостью " + getPrice());
    }
}
