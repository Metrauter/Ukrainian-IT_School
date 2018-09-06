package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;

import java.util.Map;


public class Category {
    private String name;
    private Map<Integer, Item> itemMap;

    public Category(String name, Map<Integer, Item> itemMap) {
        this.name = name;
        this.itemMap = itemMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Map<Integer, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap( Map<Integer, Item> itemMap) {
        this.itemMap = itemMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (!name.equals(category.name)) return false;
        return itemMap != null ? itemMap.equals(category.itemMap) : category.itemMap == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (itemMap != null ? itemMap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name: '" + name + '\'' +
                ", itemSet: " + itemMap +
                '}';
    }
}
