package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2){
            return o1.getName().compareTo(o2.getName());
        }
    }
