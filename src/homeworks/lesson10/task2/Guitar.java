package homeworks.lesson10.task2;

import java.util.Objects;

public class Guitar implements Instrument {
    int quantityStr;

    public int getQuantityStr() {
        return quantityStr;
    }

    public void setQuantityStr(int quantityStr) {
        this.quantityStr = quantityStr;
    }

    public Guitar(int quantityStr) {
        this.quantityStr = quantityStr;
    }


    @Override
    public void play() {
        System.out.println("Играет гитара c " + quantityStr + " струнами");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;
        Guitar guitar = (Guitar) o;
        return getQuantityStr() == guitar.getQuantityStr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantityStr());
    }
}
