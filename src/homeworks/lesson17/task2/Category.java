package homeworks.lesson17.task2;

import homeworks.lesson16.task6.Item;
import java.util.Set;


public class Category {
    private String name;
    private Set<Item> itemSet;

    public Category(String name, Set<Item> itemSet) {
        this.name = name;
        this.itemSet = itemSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (!name.equals(category.name)) return false;
        return itemSet != null ? itemSet.equals(category.itemSet) : category.itemSet == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (itemSet != null ? itemSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name: '" + name + '\'' +
                ", itemSet: " + itemSet +
                '}';
    }
}
