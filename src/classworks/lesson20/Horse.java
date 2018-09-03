package classworks.lesson20;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;

        Horse horse = (Horse) o;

        return halter != null ? halter.equals(horse.halter) : horse.halter == null;
    }

    @Override
    public int hashCode() {
        return halter != null ? halter.hashCode() : 0;
    }

    public Horse(Halter halter) {

        this.halter = halter;
    }
}