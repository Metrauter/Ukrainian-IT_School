package homeworks.lesson10.task4;

public class Tie extends Cloth implements ManCloth {
    public Tie(Size size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void clotheMan() {
        System.out.println("Одеваем галстук на мужчину " + getColour() + " цвета " + getSize() +
                " размера, стоимостью " + getPrice());
    }
}
