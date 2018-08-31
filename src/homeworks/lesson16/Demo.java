package homeworks.lesson16;

import java.util.Comparator;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Category phone = new Category("Phone", new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        fillCategory(phone);
        printItems(phone);

        phone = new Category("Phone", new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        fillCategory(phone);
        printItems(phone);

        phone = new Category("Phone", new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                int ratingDiff =  Integer.compare(o1.getRating(), o2.getRating());
                return ratingDiff != 0 ? ratingDiff : 1;
            }
        });
        fillCategory(phone);
        printItems(phone);
    }

    public static void fillCategory(Category category) {
        category.addItem(new Item("Nokia 3310", 1340, 3));
        category.addItem(new Item("Apple 6s", 1858, 5));
        category.addItem(new Item("Samsung J500", 1708, 2));
        category.addItem(new Item("Acer G54", 997, 1));
        category.addItem(new Item("Meizu M6", 1703, 4));
        category.addItem(new Item("Xiaomi MI6", 1558, 3));
        category.addItem(new Item("Xiaomi Redmi 3s", 1562, 5));
        category.addItem(new Item("Siemens A65", 245, 3));
        category.addItem(new Item("Alkatel 54", 2524, 1));
        category.addItem(new Item("Siemens M65", 4050, 2));
    }

    public static void printItems(Category category) {
        Iterator<Item> iterator = category.getItemSet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
