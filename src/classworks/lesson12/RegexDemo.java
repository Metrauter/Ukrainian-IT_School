package classworks.lesson12;

        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}