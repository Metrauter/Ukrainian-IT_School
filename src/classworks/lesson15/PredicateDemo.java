package classworks.lesson15;

import java.util.function.Predicate;

/**
 * Created by Student on 13.08.2018.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "not null";
        String str3 = "";
        Predicate<String> predicate1 = str -> str != null;
        Predicate<String> predicate2 = str -> !str.isEmpty();
        Predicate<String> predicate3 = predicate1.and(predicate2);
        System.out.println(predicate3.test(str1));
        System.out.println(predicate3.test(str2));
        System.out.println(predicate3.test(str3));
    }
}

