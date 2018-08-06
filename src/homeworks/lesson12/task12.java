package homeworks.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task12 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]+\\s";
        String s = "One two three раз два три one1 two2 123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) {
            System.out.println("Слова с латинскими буквами: " + matcher.group());
            count++;
        }
        System.out.println("Количество слов: " + count);
    }
}