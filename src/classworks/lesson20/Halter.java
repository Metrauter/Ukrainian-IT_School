package classworks.lesson20;

import java.io.Serializable;

public class Halter implements Serializable {
    private int size;

    public Halter(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Halter)) return false;

        Halter halter = (Halter) o;

        return size == halter.size;
    }

    @Override
    public int hashCode() {
        return size;
    }
}
