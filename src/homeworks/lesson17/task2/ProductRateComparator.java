package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;

import java.util.Comparator;

public class ProductRateComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int ratingDiff =  Integer.compare(o1.getRating(), o2.getRating());
        return ratingDiff != 0 ? ratingDiff : 1;
    }
}
