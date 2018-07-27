package classworks.lesson9;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(3);
        Fruit apple2 = new Apple(4);
        Fruit pear = new Pear(5);

        Fruit[] fruits = {apple1, apple2, pear};

        for (Fruit fruit : fruits) {
            System.out.println(fruit.getCost());
        }
        System.out.println("Общая стоимость фруктов " + Fruit.getCost(fruits));
        System.out.println("Общая стоимаость яблок " + Fruit.getCost(apple1, apple2));
        System.out.println(apple2.getCost());
        apple1.printManufacturerInfo();
    }
}
