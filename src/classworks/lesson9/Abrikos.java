package classworks.lesson9;

public class Abrikos extends Fruit {

    public static final int COST_PER_KG = 54;

    public Abrikos(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return getWeight() * COST_PER_KG;
    }
}
