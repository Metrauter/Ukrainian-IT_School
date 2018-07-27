package classworks.lesson9;

public class Apple extends Fruit {

    public static final int PRICE_PER_KG = 30;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return getWeight() * PRICE_PER_KG;
    }
}
