package classworks.lesson13;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printTopic(new Locale("ru", "RU"));
        printTopic(Locale.ENGLISH);
    }

    private static void printTopic(Locale locale)
            throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("topic", locale);
        System.out.println(locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}