package classworks.lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        print(3, 56);
    }

    public static void print(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append("+").append(b);
        stringBuilder.append("=").append(a + b).append("\n");

        stringBuilder.append(a).append("-").append(b);
        stringBuilder.append("=").append(a - b).append("\n");

        stringBuilder.append(a).append("*").append(b);
        stringBuilder.append("=").append(a * b);

        System.out.println(stringBuilder);

        replaceSymbol(stringBuilder, "=", " равно ");

        System.out.println(stringBuilder);
    }

    private static void replaceSymbol(StringBuilder stringBuilder, String subString, String newString) {
        int pos;
        while ((pos = stringBuilder.indexOf(subString)) != -1) {
//            stringBuilder.deleteCharAt(pos);
//            stringBuilder.insert(pos, newString);

            stringBuilder.replace(pos, pos + subString.length(), newString);
        }
    }
}