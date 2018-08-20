package classworks.lesson16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1(3, 2, 3, 1));
        list.add(new HeavyBox1(8, 3, 5, 2));
        list.add(new HeavyBox1(4, 2, 1, 1));
        list.add(new HeavyBox1(3, 8, 5, 6));

        System.out.println("Размер");

        list.forEach(System.out::println);

        HeavyBox1 firstBox = list.get(0);
        firstBox.weight += 1;

        list.remove(list.size() - 1);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
