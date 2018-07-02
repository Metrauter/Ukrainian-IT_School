package homeworks.lesson3.task4;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = getValue(scn, "первое");
        int k = getValue(scn, "второе");
        System.out.println("Сумма двух целых чисел: " + (i + k));
    }

    private static int getValue(Scanner scanner, String str) {
        System.out.println("Введите " + str + " целое число");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Ошибка. Вы ввели не целое число");
            return 0;
        }
    }

}