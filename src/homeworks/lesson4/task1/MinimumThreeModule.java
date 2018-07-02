package homeworks.lesson4.task1;

import java.util.Scanner;

public class MinimumThreeModule {
    public static void main(String[] args) {
        double a, b, c, min;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите првое число: ");
        a = input.nextDouble();
        System.out.println("Введите второе число: ");
        b = input.nextDouble();
        System.out.println("Введите третье число: ");
        c = input.nextDouble();
        min = (Math.abs(a) < Math.abs(b) ? (Math.abs(a) < Math.abs(c) ? a : c) : (Math.abs(b) < Math.abs(c) ? b : c));
        System.out.println("Минимальное число: " + min);
    }
}