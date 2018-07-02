package homeworks.lesson5.task18;

import java.util.Arrays;
import java.util.Scanner;

public class GirlandaMass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] ger = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        for (; ; ) {
            System.out.println("Выберите пункт: ");
            System.out.println("1. Режим мигания");
            System.out.println("2. Режим бегущей строки");
            System.out.println("3. Состояние первой ламопчки");
            System.out.println("4. Состояние гирлянды");
            System.out.println("5. Exit");
            if (scn.hasNextInt()) {
                int s = scn.nextInt();
                switch (s) {
                    case 1:
                        System.out.println("Сколько раз будет мигать гирлянда? ");
                        if (scn.hasNextInt()) {
                            int a = scn.nextInt();
                            flash(a, ger);
                            break;
                        } else {
                            System.out.println("Вы ввели не целое число");
                            System.exit(0);
                        }
                    case 2:
                        line(ger);
                        break;
                    case 3:
                        mask(ger);
                        break;
                    case 4:
                        status(ger);
                        break;
                    case 5:
                        System.exit(0);
                }
            } else {
                System.out.println("Вы ввели не целое число");
                System.exit(0);
            }
        }
    }

    private static void flash(int a, int[] ger) {
        for (int j = 1; j <= a; j++) {
            int n = ger.length;
            int temp;
            for (int i = 0; i < n / 2; i++) {
                temp = ger[n - i - 1];
                ger[n - i - 1] = ger[i];
                ger[i] = temp;
            }
            System.out.println(Arrays.toString(ger));
            }
        }

    private static void line(int[] ger) {
        for (int i = 0; i < ger.length; i++) {
            System.arraycopy(ger, 1, ger, 2, 30);
            System.out.println(Arrays.toString(ger));
        }
    }

    private static void mask(int[] ger) {
        if (ger[0] == 0) {
            System.out.println("\nВ данный момент лампочка не горит!\n");
        } else {
            System.out.println("\nВ данный момент лампочка горит!\n");
        }
    }

    private static void status(int[] ger) {
        System.out.println("\nТекущее состояние гирлянды\n");
        System.out.println(Arrays.toString(ger));
    }
}