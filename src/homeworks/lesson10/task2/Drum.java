package homeworks.lesson10.task2;

import java.util.Objects;

public class Drum implements Instrument {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан " + size + " размера");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drum)) return false;
        Drum drum = (Drum) o;
        return getSize() == drum.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize());
    }
}
