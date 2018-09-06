package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;

import java.util.Comparator;
import java.util.Map;

public class PriceComparator implements Comparator<Item> {
    Map<Integer, Item> base;

    public PriceComparator(Map<Integer, Item> base) {
        this.base = base;
    }
    @Override
    public int compare(Item o1, Item o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

