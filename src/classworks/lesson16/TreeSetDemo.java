package classworks.lesson16;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox1> set = new TreeSet<>();
        set.add(new HeavyBox1(3, 2, 3, 1));
        set.add(new HeavyBox1(8, 3, 5, 2));
        set.add(new HeavyBox1(4, 2, 1, 1));
        set.add(new HeavyBox1(3, 8, 5, 6));

        for (HeavyBox1 heavyBox1 : set) {
            System.out.println(heavyBox1);
        }
    }
}
