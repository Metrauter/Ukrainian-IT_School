package homeworks.lesson3.task3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            if (scn.nextInt() % 2 == 0) {
                System.out.println("Число четное!");
            } else {
                System.out.println("Число не четное!");
            }
        } else {
            System.out.println("Ошибка! Вы ввели не целое число!");
        }
    }
}