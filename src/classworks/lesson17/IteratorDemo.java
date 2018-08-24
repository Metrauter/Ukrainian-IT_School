package classworks.lesson17;

import classworks.lesson16.HeavyBox1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1(400, 500, 100, 200));
        list.add(new HeavyBox1(500, 500, 400, 700));
        list.add(new HeavyBox1(500, 500, 300, 400));
        list.add(new HeavyBox1(900, 700, 600, 800));

        List<HeavyBox1> result = getBigBoxes(list);
        System.out.println(list);
        System.out.println(result);
    }

    private static List<HeavyBox1> getBigBoxes(List<HeavyBox1> list) {
        List<HeavyBox1> list2 = new ArrayList<>();
        Iterator<HeavyBox1> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox1 box = iterator.next();
            if (box.getWeight() > 300) {
                list2.add(box);
                iterator.remove();
            }
        }
        return list2;
    }
}