package homeworks.lesson5.task16;

import java.util.Arrays;

import static homeworks.lesson5.task16.BubbleSorter2.sort;


public class BubbleSorterTest2 {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {7, 4, 1, 2, 9},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
