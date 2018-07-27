package classworks.lesson9;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double getCost();

    public static double getCost(Fruit... fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.getCost();

        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;

        Fruit fruit = (Fruit) o;

        return Double.compare(fruit.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getWeight());
        return (int) (temp ^ (temp >>> 32));
    }
}