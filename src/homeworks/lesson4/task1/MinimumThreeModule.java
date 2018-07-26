package homeworks.lesson4.task1;

import java.util.Scanner;

public class MinimumThreeModule {
    public static void main(String[] args) {
        double a, b, c, min;
        Scanner input = new Scanner(System.in);

        a = getDouble(input);
        b = getDouble(input);
        c = getDouble(input);
        min = (Math.abs(a) < Math.abs(b) ? (Math.abs(a) < Math.abs(c) ? a : c) : (Math.abs(b) < Math.abs(c) ? b : c));
        System.out.println("Минимальное число: " + min);
    }

    private static double getDouble(Scanner input) {
        double s;
        System.out.println("Введите число: ");
        s = input.nextDouble();
        return s;
    }
}
