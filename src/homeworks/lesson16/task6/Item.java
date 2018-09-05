package homeworks.lesson16.task6;

public class Item {
    private String name;
    private double price;
    private int rating;
    private int id;
    private static int count = 0;

    public Item(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        id = count;
        id++;
    }

    public int getId() {
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

        Item product = (Item) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (rating != product.rating) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rating;
        return result;
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
