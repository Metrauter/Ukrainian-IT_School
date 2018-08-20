package classworks.lesson14;

/**
 * Created by Student on 13.08.2018.
 */
public class Food {
    public void prepare(Cookable c) {
        c.cook("Жарим картошку");
    }

    public static void main(String[] args) {
        Food food = new Food();
//        Cookable cookable = () -> System.out.println("Жарим картошку");

//        Cookable cookable = new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("Жарим картошку");
//            }
//        };
        food.prepare(System.out::println);
    }
}
