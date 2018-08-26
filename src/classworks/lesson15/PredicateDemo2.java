package classworks.lesson15;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        String str1 = "JavA";
        String str2 = "NaA";
        String str3 = "Some String";
        String str4 = "Java";
        Predicate<String> predicate1 = str -> str.startsWith("J");
        Predicate<String> predicate2 = str -> str.startsWith("N");
        Predicate<String> predicate3 = str -> str.endsWith("A");
        Predicate<String> predicate4 = str -> str != null;

        Predicate<String> predicateOr = predicate1.or(predicate2);
        Predicate<String> predicate = predicate4.and(predicateOr).and(predicate3
        );

        System.out.println(predicate.test(str1));
        System.out.println(predicate.test(str2));
        System.out.println(predicate.test(str3));
        System.out.println(predicate.test(str4));
    }
}
