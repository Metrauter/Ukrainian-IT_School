package homeworks.lesson4.task2;

import java.util.Scanner;

public class Girlanda {
    public static void main(String[] args) {
        Girlanda g = new Girlanda();
        int ger = 7654;
        Scanner scn = new Scanner(System.in);
        System.out.println("Сколько раз будет мигать герлянда? ");
        int a = scn.nextInt();
        g.flash(a, ger);
        g.line(ger);
        g.mask(ger);
        g.status(ger);
    }

    private void flash(int a, int ger) {
        int f = ~ger;
        String s = Integer.toBinaryString(f);
        System.out.println("\nГирлянда в режиме мигания\n");
        for (int j = s.length(); j < 32; j++) {
            s = "0" + s;
        }
        String c = Integer.toBinaryString(ger);
        for (int j = c.length(); j < 32; j++) {
            c = "0" + c;
        }
        for (int i = 1; i <= a; i++) {
            System.out.println(c);
            System.out.println(s);
        }
    }

    private void line(int ger) {
        System.out.println("\nГирлянда в режиме бегущей строки\n");
        for (int i = ger; i > 0; ) {
            i = i << 1;
            String s = Integer.toBinaryString(i);
            for (int j = s.length(); j < 32; j++) {
                s = "0" + s;
            }
            System.out.println(s);
        }
    }

    private void mask(int ger) {
        String s = Integer.toBinaryString(ger);
        for (int j = s.length(); j < 32; j++) {
            s = "0" + s;
        }
        if (s.startsWith("0", 0)) {
            System.out.println("\nВ данный момент лампочка не горит!");
        } else System.out.println("\nВ данный момент лампочка горит!");
    }

    private void status(int ger) {
        String s = Integer.toBinaryString(ger);
        for (int j = s.length(); j < 32; j++) {
            s = "0" + s;
        }
        System.out.println("\nТекущее состояние гирлянды\n");
        System.out.println(s);
    }
}