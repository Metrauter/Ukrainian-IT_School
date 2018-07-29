package homeworks.lesson10.task2;

import java.util.Objects;

public class Chimney implements Instrument {
    double diametr;

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public Chimney(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет труба c диаметром " + diametr + " см");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chimney)) return false;
        Chimney chimney = (Chimney) o;
        return Double.compare(chimney.getDiametr(), getDiametr()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiametr());
    }
}
