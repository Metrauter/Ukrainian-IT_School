package classworks.lesson9;

public class Pear extends Fruit {

    public static final int PRICE_PER_KG = 24;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return getWeight() * PRICE_PER_KG;
    }
}
