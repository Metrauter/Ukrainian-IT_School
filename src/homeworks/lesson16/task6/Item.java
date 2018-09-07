package homeworks.lesson16.task6;

import java.util.Objects;
import java.util.TreeMap;

public class Item {
    private String name;
    private double price;
    private int rating;
    private  int id;
    private static int count = 1;

    public Item(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        id = count++;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Item.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.getPrice(), getPrice()) == 0 &&
                getRating() == item.getRating() &&
                Objects.equals(getName(), item.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getRating());
    }

    @Override
    public String toString() {
        return "Item{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                ", rating: " + rating +
                '}';
    }
}
