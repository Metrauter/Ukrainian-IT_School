package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;

import java.util.Comparator;

public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

