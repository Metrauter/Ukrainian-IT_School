package homeworks.lesson5.task8;

import java.util.Scanner;

public class GirlandaCase {
    public static void main(String[] args) {
        GirlandaCase g = new GirlandaCase();
        Scanner scn = new Scanner(System.in);
        int ger = 7654;
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
                            g.flash(a, ger);
                            break;
                        } else {
                            System.out.println("Вы ввели не целое число");
                            System.exit(0);
                        }
                    case 2:
                        g.line(ger);
                        break;
                    case 3:
                        g.mask(ger);
                        break;
                    case 4:
                        g.status(ger);
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

    private void flash(int a, int ger) {
        int f = ~ger;
        String s = getString(f);
        String c = getString(ger);
        for (int i = 1; i <= a; i++) {
            System.out.println(c);
            System.out.println(s);
        }
    }

    private String getString(int f) {
        String s = Integer.toBinaryString(f);
        for (int j = s.length(); j < 32; j++) {
            s = "0" + s;
        }
        return s;
    }

    private void line(int ger) {
        for (int i = ger; i > 0; ) {
            i = i << 1;
            String s = getString(i);
            System.out.println(s);
        }
    }

    private void mask(int ger) {
        String s = getString(ger);
        if (s.startsWith("0", 0)) {
            System.out.println("\nВ данный момент лампочка не горит!\n");
        } else {
            System.out.println("\nВ данный момент лампочка горит!\n");
        }
    }

    private void status(int ger) {
        String s = getString(ger);
        System.out.println("\nТекущее состояние гирлянды\n");
        System.out.println(s + "\n");
    }
}