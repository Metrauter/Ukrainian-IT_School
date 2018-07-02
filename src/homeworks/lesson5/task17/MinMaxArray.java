package homeworks.lesson5.task17;

import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[][] ar1 = {
                {123, 57, 51234, 34, 234, 2345, 346, 45},
                {234, 8765, 76, 3476, 456, 23, 34, 4},
                {12, 5, 235, 3234, 2345, 2, 3, 4564},
                {1, 5, 894, 768, 769, 45, 36, 4},
                {3, 7, 74, 34, 56, 23, 9756, 5}};
        int a = min(ar1[0]);
        int b = min(ar1[1]);
        int c = min(ar1[2]);
        int d = min(ar1[3]);
        int e = min(ar1[4]);
        int f = max(ar1[0]);
        int g = max(ar1[1]);
        int h = max(ar1[2]);
        int i = max(ar1[3]);
        int k = max(ar1[4]);
        System.out.println(Arrays.deepToString(ar1) + "\n");
        int[][] ar2 = {
                {a, b, c, d, e},
                {f, g, h, i, k}};
        System.out.println(Arrays.deepToString(ar2));
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

