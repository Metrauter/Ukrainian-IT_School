package classworks.lesson16;

import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<HeavyBox1> consumer1 =
                box -> System.out.println("Отгрузил ящик с весом " + box.weight);
        Consumer<HeavyBox1> consumer2 =
                box -> System.out.println("Отправляем ящик с весом " + box.weight);

        consumer1.andThen(consumer2).accept(new HeavyBox1(1, 2, 3, 4));
    }
}
