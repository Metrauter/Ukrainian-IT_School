package classworks.lesson16;

import java.util.function.Supplier;


public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random()*10;
        System.out.println(supplier.get());
    }
}

