package homeworks.lesson5.task9;

public class Factorial {
    public static void main(String[] args) {
        double b = 1;
        double n = Math.random() * 5;
        for (double i = 1; i <= n; i++) {
            b *= i;
        }
        System.out.println("Факториал случайного числа равен: " + b);
    }
}