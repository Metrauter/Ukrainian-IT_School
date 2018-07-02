package classworks.lesson4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                checkNumber(i);
        }
    }

    private static void checkNumber(int i) {
        if (i > 0 && i < 10) {
            System.out.println("Положительноечисло меньше 10");
        } else {
            System.out.println("Положительное число больше или равно 10 или отрицательное");
        }
    }
}