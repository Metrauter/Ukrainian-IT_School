package classworks.lesson16;

import java.util.function.Supplier;

public class ReferencesDemo2 {
    public static void main(String[] args) {
        Supplier<String> newString = String::new;
        System.out.println(newString.get());
    }
}
