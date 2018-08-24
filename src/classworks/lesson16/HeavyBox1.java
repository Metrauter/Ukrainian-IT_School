package classworks.lesson16;

public class HeavyBox1 extends Box6 implements Comparable<HeavyBox1> {
    public int weight; // вес коробки

    public HeavyBox1(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox1() {
        this.weight = -1;
    }

    @Override
    public int compareTo(HeavyBox1 heavyBox1) {
        int heavyBoxWeight = heavyBox1.getWeight();
        return this.weight - heavyBoxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox1{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                "} " + super.toString();
    }
}