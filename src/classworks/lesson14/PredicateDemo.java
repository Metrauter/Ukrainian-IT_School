package classworks.lesson14;

import java.util.function.Predicate;

/**
 * Created by Student on 13.08.2018.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        String s = null;
        Predicate<String> predicate1 = str -> str != null;
        System.out.println(predicate1.test("asfsadf"));
        System.out.println(predicate1.test(s));
        System.out.println();
    }
}

